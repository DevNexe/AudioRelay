package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hnK {
    public static final ed1 a = new ed1(QnHx.F);
    public static final ed1 b = new ed1(CQf.F);

    public /* synthetic */ class CQf extends l91 implements x81<Integer, Integer, Integer> {
        public static final CQf F = new CQf();

        public CQf() {
            super(2, sa2.class, "max", "max(II)I", 1);
        }

        @Override // defpackage.x81
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.max(num.intValue(), num2.intValue()));
        }
    }

    public /* synthetic */ class QnHx extends l91 implements x81<Integer, Integer, Integer> {
        public static final QnHx F = new QnHx();

        public QnHx() {
            super(2, sa2.class, "min", "min(II)I", 1);
        }

        @Override // defpackage.x81
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.min(num.intValue(), num2.intValue()));
        }
    }
}
