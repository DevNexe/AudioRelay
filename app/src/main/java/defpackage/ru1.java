package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ru1 {
    public Object[] a = new Object[8];
    public int[] b;
    public int c;

    public static final class QnHx {
        public static final QnHx a = new QnHx();
    }

    public ru1() {
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.b = iArr;
        this.c = -1;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.c + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.a[i2];
            if (obj instanceof pa4) {
                pa4 pa4Var = (pa4) obj;
                if (!ur1.a(pa4Var.e(), uv4.CQf.a)) {
                    int i3 = this.b[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(pa4Var.g(i3));
                    }
                } else if (this.b[i2] != -1) {
                    sb.append("[");
                    sb.append(this.b[i2]);
                    sb.append("]");
                }
            } else if (obj != QnHx.a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return a();
    }
}
