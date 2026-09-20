package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f25 {
    public static final LPt8Fixed a = new LPt8Fixed(null, false);
    public static final LPt8Fixed b = new LPt8Fixed(null, true);
    public static final LPt8Fixed c;
    public static final LPt8Fixed d;

    public interface CQf {
        int a(int i, CharSequence charSequence);
    }

    public static abstract class F1 implements e25 {
        public final CQf a;

        public F1(QnHx qnHx) {
            this.a = qnHx;
        }

        public abstract boolean a();

        public final boolean b(int i, CharSequence charSequence) {
            if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
                throw new IllegalArgumentException();
            }
            CQf cQf = this.a;
            if (cQf == null) {
                return a();
            }
            int iA = cQf.a(i, charSequence);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return a();
            }
            return false;
        }
    }

    public static class LPt8Fixed extends F1 {
        public final boolean b;

        public LPt8Fixed(QnHx qnHx, boolean z) {
            super(qnHx);
            this.b = z;
        }

        @Override // f25.F1
        public final boolean a() {
            return this.b;
        }
    }

    public static class QnHx implements CQf {
        public static final QnHx a = new QnHx();

        /* JADX WARN: Code duplicated, block: B:11:0x001f  */
        /* JADX WARN: Code duplicated, block: B:12:0x0021  */
        @Override // f25.CQf
        public final int a(int i, CharSequence charSequence) {
            int i2 = i + 0;
            int i3 = 2;
            for (int i4 = 0; i4 < i2 && i3 == 2; i4++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i4));
                LPt8Fixed lPt8 = f25.a;
                if (directionality == 0) {
                    i3 = 1;
                } else if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            i3 = 1;
                            break;
                        case 16:
                        case 17:
                            i3 = 0;
                            break;
                        default:
                            i3 = 2;
                            break;
                    }
                } else {
                    i3 = 0;
                }
            }
            return i3;
        }
    }

    static {
        QnHx qnHx = QnHx.a;
        c = new LPt8Fixed(qnHx, false);
        d = new LPt8Fixed(qnHx, true);
    }
}
