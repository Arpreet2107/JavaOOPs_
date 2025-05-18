    public class Book implements Cloneable {

        private final String t;  //title


        public Book(String t) {

            this.t = t;

        }

        @Override

        public Object clone() throws CloneNotSupportedException {

            return super.clone();

        }

        public String getTitle() {
            return t;
        }

    }