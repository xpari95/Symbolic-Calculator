# Symbolic-Calculator
A calculator where you enter a file with text (one equation per line) and it calculates the result
Ι. Στόχος
Στην εργασία αυτή θα ασχοληθούμε με αντικειμενοστραφή σχεδίαση προβλημάτων, σχεδίαση διεπαφών,
κλάσεων, μεθόδους, αντικείμενα, κληρονομικότητα και πολυμορφισμό. Η άσκηση αποτελείται από πολλαπλά
μέρη. Υλοποιήστε όλα τα μέρη σε αρχεία Java, όπου η κάθε κλάση να αντιπροσωπεύει ένα ξεχωριστό
αντικείμενο.

ΙΙ. Περιγραφή
Σε αυτήν την άσκηση πρέπει να σχεδιάσετε κλάσεις για να μοντελοποιήσετε αριθμητικές εκφράσεις. Μια
αριθμητική έκφραση αποτελείται από αριθμούς και τους αριθμητικούς τελεστές: πρόσθεση, αφαίρεση,
πολλαπλασιασμός, διαίρεση. Ένα παράδειγμα αριθμητικής έκφρασης είναι το ακόλουθο: 3 + (4.7 + 2.3) * 5 .
Οι αριθμητικές εκφράσεις μπορούν να αναπαριστούν μέσω ενός δυαδικού δέντρου. Οι εσωτερικοί κόμβοι του
δέντρου είναι οι τελεστές, και τα φύλλα οι αριθμοί. Το αριστερό και δεξιό παιδί ενός κόμβου αντιπροσωπεύουν
δυο υπο-εκφράσεις, τις οποίες ονομάζουμε αριστερή και δεξιά υπο-έκφραση ΙΙI. Ζητούμενα Άσκησης
Ζητούμενο αυτής της άσκησης είναι να κάνετε αντικειμενοστραφή σχεδίαση μιας υπολογιστικής μηχανής
ακλουθώντας τις οδηγίες που σας δίνονται. Το πρόγραμμα πρέπει να υποστηρίζει την εισαγωγή δεδομένων
από ένα αρχείο με το όνομα arithmetics.txt στον οποίο υπάρχουν αριθμητικές εκφράσεις μια σε κάθε
γραμμή. Το πρόγραμμα πρέπει να κάνει την αποτίμηση των αριθμητικών εκφράσεων και να εμφανίσει τα
αποτελέσματα στην οθόνη.
Σχεδίαση προγράμματος σε διεπαφές και κλάσεις
Το πρόγραμμα σας πρέπει να υλοποιεί τουλάχιστον τις ακόλουθες διεπαφές και κλάσεις:
ΕΠΛ133 – Αντικειμενοστραφής Προγραμματισμός – Τμήμα Πληροφορικής – Πανεπιστήμιο Κύπρου
2
• Δημιουργήστε μια διεπαφή ArithExpr η οποία δηλώνει τις λειτουργίες μια αριθμητικής έκφρασης. Η μόνη
λειτουργία που χρειάζεται είναι αυτή που κάνει την αποτίμηση της έκφρασης. Δημιουργήστε για αυτή τη
μέθοδο eval() με τους κατάλληλους παραμέτρους και τύπο επιστροφής.
Για να μοντελοποιήσομε την έκφραση, θα δημιουργήσετε αντικείμενα για κάθε κόμβο. Τα αντικείμενα αυτά,
θα είναι διαφορετικά, στιγμιότυπα κλάσεων, ανάλογα με την περίπτωση, δηλαδή εάν πρόκειται για
εσωτερικούς κόμβους ή φύλλα του δέντρου.
• Δημιουργήστε μια κλάση Constant για τις σταθερές (αριθμούς) της έκφρασης.
• Δημιουργήστε 4 κλάσεις, Addition, Subtraction, Multiplication και Division για τις
αριθμητικές πράξεις. Σημειώστε ότι, οι 4 αυτές κλάσεις, έχουν αρκετά κοινά χαρακτηριστικά, οπότε πράξτε
το σωστό κατά την σχεδίαση τους.
• Δημιουργήστε τη μέθοδο toString() για να εμφανίζει τις εκφράσεις σε infix μορφή.
Η ανάγνωση μιας αριθμητικής έκφρασης από το πληκτρολόγιο ή από το αρχείο γίνεται μέσω ενός parser. Ένα
parser είναι ένα αντικείμενο, ικανό να δημιουργήσει μια αριθμητική έκφραση από μια συμβολοσειρά.
• Δημιουργήστε μια αφαιρετική κλάση ArithExprParser με τουλάχιστον δυο μεθόδους parse. Η
πρώτη παίρνει σαν παράμετρο μια συμβολοσειρά, και η δεύτερη εάν Reader/Scanner.
• Γράψτε μια κλάση InfixParser που επιτρέπει την ανάγνωση μιας αριθμητικής έκφρασης σε infix
μορφή. Η infix μορφή είναι ο συνήθης τρόπος που γράφουμε εκφράσεις.
• Δημιουργήστε μια κλάση ArithmeticCalculator η οποία να περιέχει μόνο τη μέθοδο main().
Αυτό το σύνολο των κλάσεων είναι η βάση μιας μικρής συμβολικής αριθμομηχανής. Μια αριθμομηχανή εκτελεί
διαδοχικά τις οδηγίες που μπορεί να είναι ανάθεση ή αξιολόγηση εκφράσεων. Κάθε οδηγία πρέπει να παρέχεται
σε μια γραμμή. Οι γραμμές πρέπει να διαβάζονται από ένα αρχείο εάν ένα όνομα αρχείου δίνεται στη γραμμή
εντολών ή από το πληκτρολόγιο εάν δεν δίνεται αρχείο στη γραμμή εντολών. Μεταξύ των συστατικών (αριθμοί
και τελεστές) των εκφράσεων να υπάρχει κενός χαρακτήρας.
Αποτίμηση αριθμητικής έκφρασης
Για την αποτίμηση μιας αριθμητικής έκφρασης σε infix μορφή χρησιμοποιήστε των αλγόριθμο που
περιγράφεται στο τέλος της εκφώνησης. Ο αλγόριθμος αυτός χρησιμοποίει τη δομή δεδομένων στοίβα.
Μπορείτε να χρησιμοποιήσετε τη κλάση Stack από το java.util ή να δημιουργήσετε εσείς μια κλάση Stack και να
τη χρησιμοποιήσετε. 

The algorithm for evaluating an infix expression
You need two stacks, a value stack (to hold the numbers), and an operator stack (to hold the operators).
Numbers will be double values, operators will be char values.
The algorithm is roughly as follows. Note that no error checking is done explicitly; you should add that yourself.
1. If the first token is a variable and the second token is =, this is an assignment. Compute the rest of the
expression as usual, do the assignment, and terminate.
2. While there are still tokens to be read in,
   1. Get the next token.
   2. If the token is:
       1. A number: push it onto the value stack.
       2. A variable: get its value, and push its value onto the value stack.
       3. A left parenthesis: push it onto the operator stack.
       4. A right parenthesis:
          1. While the thing on top of the operator stack is not a left parenthesis,
             1. Pop the operator from the operator stack.
             2. Pop the value stack twice, getting two operands.
             3. Apply the operator to the operands, in the correct order.
             4. Push the result onto the value stack.
          2. Pop the left parenthesis from the operator stack, and discard it.
       5. An operator (call it thisOp):
           1. While the operator stack is not empty, and the top thing on the operator stack
has the same or greater precedence as thisOp,
                1. Pop the operator from the operator stack.
                2. Pop the value stack twice, getting two operands.
                3. Apply the operator to the operands, in the correct order.
                4. Push the result onto the value stack.
           2. Push thisOp onto the operator stack.
3. While the operator stack is not empty,
        1. Pop the operator from the operator stack.
        2. Pop the value stack twice, getting two operands.
        3. Apply the operator to the operands, in the correct order.
        4. Push the result onto the value stack.
        5. 
At this point the operator stack should be empty, and the value stack should have only one value in it,
which is the final result 
