package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nj6 extends Exception {
    public nj6(String str) {
        super(str);
    }

    public nj6(Exception exc) {
        super("Could not obtain webview for the overlay.", exc);
    }
}
