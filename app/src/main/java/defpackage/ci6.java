package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ci6 implements v17 {
    public static final ci6 a = new ci6();

    @Override // defpackage.v17
    public final boolean zza(int i) {
        char c;
        if (i != 0) {
            c = 2;
            if (i != 1) {
                if (i != 2) {
                    c = 4;
                    if (i != 3) {
                        c = i != 4 ? (char) 0 : (char) 5;
                    }
                } else {
                    c = 3;
                }
            }
        } else {
            c = 1;
        }
        return c != 0;
    }
}
