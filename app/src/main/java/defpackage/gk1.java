package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class gk1 {
    public final String a;

    public static final class CQf extends gk1 {
        public static final CQf b = new CQf();

        public CQf() {
            super("on_resume");
        }
    }

    public static final class F1 extends gk1 {
        public static final F1 b = new F1();

        public F1() {
            super("on_start");
        }
    }

    public static final class QnHx extends gk1 {
        public static final QnHx b = new QnHx();

        public QnHx() {
            super("on_create");
        }
    }

    public gk1(String str) {
        this.a = str;
    }
}
