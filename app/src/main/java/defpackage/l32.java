package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l32 {
    public static final l32 c = new l32(QnHx.b);
    public final int a;
    public final int b = 17;

    public static final class QnHx {
        public static final int a;
        public static final int b;
        public static final int c;

        static {
            a(0);
            a(50);
            a = 50;
            a(-1);
            b = -1;
            a(100);
            c = 100;
        }

        public static void a(int i) {
            if (!((i >= 0 && i < 101) || i == -1)) {
                throw new IllegalStateException("topRatio should be in [0..100] range or -1".toString());
            }
        }
    }

    public l32(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l32)) {
            return false;
        }
        l32 l32Var = (l32) obj;
        int i = l32Var.a;
        int i2 = QnHx.a;
        if (this.a == i) {
            return this.b == l32Var.b;
        }
        return false;
    }

    public final int hashCode() {
        int i = QnHx.a;
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        int i = this.a;
        if (i == 0) {
            int i2 = QnHx.a;
            str = "LineHeightStyle.Alignment.Top";
        } else if (i == QnHx.a) {
            str = "LineHeightStyle.Alignment.Center";
        } else if (i == QnHx.b) {
            str = "LineHeightStyle.Alignment.Proportional";
        } else if (i == QnHx.c) {
            str = "LineHeightStyle.Alignment.Bottom";
        } else {
            str = "LineHeightStyle.Alignment(topPercentage = " + i + ')';
        }
        sb.append((Object) str);
        sb.append(", trim=");
        int i3 = this.b;
        if (i3 == 1) {
            str2 = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i3 == 16) {
            str2 = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i3 == 17) {
            str2 = "LineHeightStyle.Trim.Both";
        } else {
            str2 = i3 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }
        sb.append((Object) str2);
        sb.append(')');
        return sb.toString();
    }
}
