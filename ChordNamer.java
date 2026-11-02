public class ChordNamer {
    public static void main(String[] args) {
        String keyInput = IO.readln("What key are we in?\n");
        String bassInput = IO.readln("What note is the bass player playing?\n");
        String notesInput = IO.readln("Enter the notes of the chord seperated by spaces");
        String[] chordNotes = keyInput.split(" ");
    }
}
