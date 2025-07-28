package org.edu;

public class Arts extends Education {
			private void bsc() {
				// TODO Auto-generated method stub

			}
			private void bed() {
				// TODO Auto-generated method stub

			}
			private void ba() {
				// TODO Auto-generated method stub

			}
			private void bba() {
				// TODO Auto-generated method stub

			}
			@Override
			String ug(String course) {
				System.out.println("undergraduate");
				return course;
			}
			@Override
			String pg(String course) {
				System.out.println("postgraduate");
			return course;
			}
			public static void main(String[] args) {
				Education e=new Arts();
				
				System.out.println(e.ug("BSc"));
				System.out.println(e.pg("MSc"));
				
			}
}
