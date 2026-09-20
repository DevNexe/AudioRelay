package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class hf4 implements uy4 {

    public static final class CQf extends hf4 {
        public final int a;
        public final zy4 b = new zy4("TCP_SOCKET_ERROR");

        public CQf(int i) {
            this.a = i;
        }

        @Override // defpackage.hf4
        public final int a() {
            return this.a;
        }

        @Override // defpackage.uy4
        public final zy4 getId() {
            return this.b;
        }
    }

    public static final class QnHx extends hf4 {
        public final int a;
        public final zy4 b = new zy4("BIND_SOCKET_ERROR");

        public QnHx(int i) {
            this.a = i;
        }

        @Override // defpackage.hf4
        public final int a() {
            return this.a;
        }

        @Override // defpackage.uy4
        public final zy4 getId() {
            return this.b;
        }
    }

    public abstract int a();
}
