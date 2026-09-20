package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface jj1<E> extends List<E>, Collection, jv1 {

    public static final class QnHx<E> extends ck32<E> implements jj1<E> {
        public final jj1<E> w;
        public final int x;
        public final int y;

        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(jj1<? extends E> jj1Var, int i, int i2) {
            this.w = jj1Var;
            this.x = i;
            zc1.e(i, i2, jj1Var.size());
            this.y = i2 - i;
        }

        @Override // defpackage.auxFixed
        public final int a() {
            return this.y;
        }

        @Override // defpackage.ck32, java.util.List
        public final E get(int i) {
            zc1.c(i, this.y);
            return this.w.get(this.x + i);
        }

        @Override // java.util.List
        public final List subList(int i, int i2) {
            zc1.e(i, i2, this.y);
            int i3 = this.x;
            return new QnHx(this.w, i + i3, i3 + i2);
        }
    }
}
