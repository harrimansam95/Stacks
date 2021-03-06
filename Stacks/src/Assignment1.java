
public class Assignment1 extends javax.swing.JFrame {

    /**
     * Creates new form Assignment1
     */
    public Assignment1() {
        initComponents();
    }

    public class Node {

        private Object element; // element stored in this node
        private Node next; // reference to the next node in the list

        // constructors
        public Node() //# create a node with a null element and next reference
        {
            this(null, null);
        }

        public Node(Object e, Node n) //# create a node given element and next
        {
            element = e;
            next = n;
        }
        // update methods

        public void setElement(Object newElem) {
            element = newElem;
        }

        public void setNext(Node newNext) {
            next = newNext;
        }
        // accessor methods

        public Object getElement() {
            return element;
        }

        public Node getNext() {
            return next;
        }
    }

    public class LinkedNode {

        public Node top;
        public int stackSize;

        public int stackSize() {
            return stackSize;
        }

        public boolean isEmpty() { //# Returns true if the stack is empty
            if (top == null) {
                return true;
            } else {
                return false;
            }
        }

        public void push(Object obj) { //# Push a new object on the stack
            Node n = new Node();
            n.setElement(obj);
            n.setNext(top);
            top = n;
            stackSize++;
        }

        public Object pop() { //# Pop off the top stack element
            Object temp;
            if (isEmpty()) {
                System.out.println("Stack is empty");
            }
            temp = top.getElement();
            top = top.getNext(); // link-out the top node
            stackSize--;
            return temp;
        }

        public Object top() { //  Return the top stack element
            if (isEmpty()) {
                return "Stack is empty.";
            }
            return top.getElement();
        }

        public boolean searchStack(Object st) {
            Node current = top;
            while (current != null) {
                if (current.getElement().equals(st)) {

                    return true;
                }
                current = current.getNext();

            }

            return false;

        }

        void clearStack() {
            int temp = stackSize;
            for (int i = 0; i < temp; i++) {
                top = top.getNext();
                stackSize--;

            }
        }

        Object printStack() {
            Node current = top;
            Object obj = "";
            int count = 1;
            if (isEmpty() || stackSize <= 0) {
                obj = "Stack is empty.";
                return obj;
            }
            while (current != null) {
                obj += ("Position: " + count + ": " + current.getElement() + "\n");
                current = current.getNext();
                count++;
            }
            return obj;
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton11 = new javax.swing.JButton();
        insert = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        isEmpty = new javax.swing.JButton();
        isFUll = new javax.swing.JButton();
        topOfStack = new javax.swing.JButton();
        noOfItems = new javax.swing.JButton();
        searchStack = new javax.swing.JButton();
        clearStack = new javax.swing.JButton();
        printStack = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jButton11.setText("jButton11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stack");

        insert.setText("Insert onto top of stack");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        remove.setText("Remove item at top of stack");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        isEmpty.setText("Check for Empty stack");
        isEmpty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isEmptyActionPerformed(evt);
            }
        });

        isFUll.setText("Check for Full Stack");
        isFUll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isFUllActionPerformed(evt);
            }
        });

        topOfStack.setText("View data currently at top of stack");
        topOfStack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topOfStackActionPerformed(evt);
            }
        });

        noOfItems.setText("Return number of items currently in stack");
        noOfItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noOfItemsActionPerformed(evt);
            }
        });

        searchStack.setText("Search stack for a target item");
        searchStack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchStackActionPerformed(evt);
            }
        });

        clearStack.setText("Clear all values from stack");
        clearStack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearStackActionPerformed(evt);
            }
        });

        printStack.setText("Print stack");
        printStack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printStackActionPerformed(evt);
            }
        });

        exit.setText("Exit application");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(topOfStack, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(insert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(remove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(isEmpty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(isFUll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noOfItems, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(printStack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchStack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clearStack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(noOfItems)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchStack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearStack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(printStack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exit))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(insert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(remove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isEmpty)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isFUll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(topOfStack)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(1);
    }//GEN-LAST:event_exitActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed

        if (jTextField1.getText().equals("")) {
            jTextArea1.append("must insert text\n");
        } else {

            Object obj = jTextField1.getText();
            newStack.push(obj);
            jTextArea1.append(obj.toString() + " added\n");

        }
        jTextField1.setText("");
    }//GEN-LAST:event_insertActionPerformed
    //checks top of stack
    private void topOfStackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topOfStackActionPerformed
        if (newStack.isEmpty()) {
            jTextArea1.append("Stack is empty, nothing is at the top.\n");
        } else {
            Object obj = (newStack.top());
            jTextArea1.append(obj.toString());
        }
    }//GEN-LAST:event_topOfStackActionPerformed
    //looks at all the item in the stack 
    private void noOfItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noOfItemsActionPerformed
        jTextArea1.append("\nthere are " + newStack.stackSize() + " items currently in the stack\n");
    }//GEN-LAST:event_noOfItemsActionPerformed
    //removes an item form the top of the stack
    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        if (newStack.isEmpty()) {
            jTextArea1.append("The stack is empty!!!\n");
        } else {
            Object temp = newStack.pop();
            jTextArea1.append(temp.toString() + " removed\n");
            jTextArea1.append("");
        }
    }//GEN-LAST:event_removeActionPerformed
    //check if the stack is empty
    private void isEmptyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isEmptyActionPerformed
        if (newStack.isEmpty()) {
            jTextArea1.append("The stack is empty\n");
        } else {
            jTextArea1.append("The stack is not empty\n");
        }
        jTextField1.setText("");
    }//GEN-LAST:event_isEmptyActionPerformed
    //check if the stack is empty
    private void isFUllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isFUllActionPerformed

        if (newStack.isEmpty()) {
            jTextArea1.append("The stack is not full\n");
        } else {
            jTextArea1.append("The stack is full\n");
        }
    }//GEN-LAST:event_isFUllActionPerformed
    //prints stack
    private void printStackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printStackActionPerformed
        Object obj = newStack.printStack();
        jTextArea1.append(obj.toString());
    }//GEN-LAST:event_printStackActionPerformed
    //clear stack
    private void clearStackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearStackActionPerformed
        if (newStack.isEmpty()) {
            jTextArea1.append("The stack is not empty\n");
        } else {
            newStack.clearStack();
            jTextArea1.append("the stack has been cleared\n");
        }
    }//GEN-LAST:event_clearStackActionPerformed
    //search stack
    private void searchStackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchStackActionPerformed
        Object searchItem = jTextField1.getText();
        if (jTextField1.getText().equalsIgnoreCase("")) {
            jTextArea1.append("Enter a value before searching.\n");

        } else {

            if (newStack.searchStack(searchItem)) {
                jTextArea1.append("Item " + searchItem + " found\n");
            } else {
                jTextArea1.append("Item not found.\n");
            }
        }
        jTextField1.setText("");
    }//GEN-LAST:event_searchStackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Assignment1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Assignment1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Assignment1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Assignment1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Assignment1().setVisible(true);
            }
        });
    }

    LinkedNode newStack = new LinkedNode();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearStack;
    private javax.swing.JButton exit;
    private javax.swing.JButton insert;
    private javax.swing.JButton isEmpty;
    private javax.swing.JButton isFUll;
    private javax.swing.JButton jButton11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton noOfItems;
    private javax.swing.JButton printStack;
    private javax.swing.JButton remove;
    private javax.swing.JButton searchStack;
    private javax.swing.JButton topOfStack;
    // End of variables declaration//GEN-END:variables
}
