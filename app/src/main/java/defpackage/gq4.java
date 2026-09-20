package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class gq4 {
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public boolean j;
    public final Object a = new Object();
    public long b = -1;
    public final ArrayList h = new ArrayList();
    public final LinkedHashSet i = new LinkedHashSet();
    public final QnHx k = new QnHx();

    public final class QnHx {
        public long a;
        public final c2 b;

        public QnHx() {
            gq0.QnHx qnHx = gq0.x;
            this.b = new c2(ps0.o0(1, kq0.MINUTES));
        }
    }

    public final void a(long j) {
        this.j = true;
        a62 a62Var = a62.a;
        long j2 = this.e - 1;
        if (j2 < 0) {
            j2 = 0;
        }
        this.e = j2;
        this.f = Math.max(this.f, this.b - j);
    }
}
