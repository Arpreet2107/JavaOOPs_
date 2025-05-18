    public class Student {

        int roll;

        @Override
        public int hashCode() {
            return roll;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Student student = (Student) obj;
            return roll == student.roll;
        }
    }