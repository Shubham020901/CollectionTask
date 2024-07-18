package CustomeObjectManupulation;

import java.util.Objects;

public class Task implements Comparable<Task> {

	 	private int id;
	    private String description;
	    private int priority;
	    
		public Task(int id, String description, int priority) {
			super();
			this.id = id;
			this.description = description;
			this.priority = priority;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public int getPriority() {
			return priority;
		}

		public void setPriority(int priority) {
			this.priority = priority;
		}

		@Override
		public String toString() {
			return "Task [id=" + id + ", description=" + description + ", priority=" + priority + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(description, id, priority);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Task other = (Task) obj;
			return Objects.equals(description, other.description) && id == other.id && priority == other.priority;
		}

		@Override
		public int compareTo(Task o) {
			// TODO Auto-generated method stub
			return Integer.compare(this.priority, o.priority);
		}
	    
	    
}
