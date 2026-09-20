package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface oc5 extends is4<Object> {

    public static final class QnHx implements oc5 {
        public final Object w;
        public final boolean x;

        public QnHx(Object obj, boolean z) {
            this.w = obj;
            this.x = z;
        }

        @Override // defpackage.is4
        public final Object getValue() {
            return this.w;
        }

        @Override // defpackage.oc5
        public final boolean h() {
            return this.x;
        }
    }

    boolean h();
}
