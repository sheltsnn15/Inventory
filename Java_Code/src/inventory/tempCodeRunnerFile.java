public void showAllOrders(){
        System.out.println(this.getName() + " " + this.getAddress());
        for (int i = 0; i < cusOrder.size(); i++) {
            cusOrder.get(i).getAllOrderDetails();
        }
    }