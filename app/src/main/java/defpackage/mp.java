package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class mp implements Iterable<Character>, jv1 {
    public final char w;
    public final char x;
    public final int y = 1;

    public mp(char c, char c2) {
        this.w = c;
        this.x = (char) ddf.i(c, c2, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator<Character> iterator() {
        return new np(this.w, this.x, this.y);
    }
}
