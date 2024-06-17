package by.itacademy.assessmenttask.Ex6;

    public class Pair <k,t>{
        private k first;
        private t last;

        public Pair(k first, t last) {
            this.first = first;
            this.last = last;
        }

        public k getFirst() {
            return first;
        }

        public t getLast() {
            return last;
        }

        public Pair<t, k> swap() {
            return (Pair<t, k>) new Pair<>(this.last, this.first);
        }

        public void replaceFirst(k first1) {
            first = first1;
        }
        public void replaceLast(t last2) {
            last = last2;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "first=" + first +
                    ", last=" + last +
                    '}';
        }
    }



