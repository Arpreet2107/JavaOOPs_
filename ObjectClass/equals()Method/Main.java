    public class Main {

        int roll;


        @Override

        public boolean equals(Object o) {

            if (o instanceof Main m) {

                return this.roll == m.roll;

            }

            return false;

        }

        @Override
        public int hashCode() {
            return Integer.hashCode(roll);
        }

    }