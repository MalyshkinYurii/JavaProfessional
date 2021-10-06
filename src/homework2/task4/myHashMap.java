package homework2.task4;

import java.util.Arrays;
import java.util.Map;

public class myHashMap<K, V> {
    private Node<K, V>[] table = new Node[10];
    private int size;


    public V put(K key, V value) {
        int index = Math.abs(key.hashCode() % table.length);

        if(table[index] == null) {
            table[index] = new Node<>(key, value);
            size++;
            return value;
        }

        Node<K, V> node = table[index];

        while(node != null) {
            if (node.getKey().equals(key)) {
                V oldValue = node.getValue();
                node.setValue(value);
                return value;
            }

            node = node.next;
        }

        table[index] = new Node<>(key, value, table[index]);

        size++;
        return value;
    }


    public V get(K key) {
        int index = Math.abs(key.hashCode() % table.length);

        if(table[index] != null) {
            Node<K,V> node = table[index];

            while(node != null) {
                if(node.getKey().equals(key)) {
                    return node.getValue();
                }
                node = node.next;
            }
        }

        return null;
    }

    public V remove(K key) {
        V value = get(key);

        int index = Math.abs(key.hashCode() % table.length);

        if(table[index] != null) {
            Node<K,V> node = table[index];

            if(node.getKey().equals(key)) {
                table[index] = node.next;
                size--;
                return value;
            }

            while (node.next != null) {
                if (node.next.getKey().equals(key)) {
                    node.next = node.next.next;
                    size--;
                    return value;
                }
                node = node.next;
            }

        }

        return value;
    }

    @Override
    public String toString() {
        if(size == 0) {
            return "{}";
        }

        String str = "{";

        for (Node<K, V> node: table) {
            if(node != null) {
                while (node != null) {
                    str += node.getKey() + "=" + node.getValue() + ", ";
                    node = node.next;
                }
            }
        }
        str = str.substring(0, str.length() - 2);
        str += "}";

        return str;
    }

    private class Node<K, V> implements Map.Entry<K, V> {
        private K key;
        private V value;
        Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            return null;
        }
    }
}
