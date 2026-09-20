package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class i63 {
    public final String a;

    public static final class CQf extends i63 {
        public static final CQf b = new CQf();

        public CQf() {
            super("running");
        }
    }

    public static final class QnHx extends i63 {
        public static final QnHx b = new QnHx();

        public QnHx() {
            super("idle");
        }
    }

    public i63(String str) {
        this.a = str;
    }
}
