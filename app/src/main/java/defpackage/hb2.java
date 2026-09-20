package defpackage;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class hb2<T> extends WE<T, T> {
    public final i91<? super Throwable, ? extends jb2<? extends T>> x;
    public final boolean y;

    public static final class QnHx<T> extends AtomicReference<vl0> implements gb2<T>, vl0 {
        public final gb2<? super T> w;
        public final i91<? super Throwable, ? extends jb2<? extends T>> x;
        public final boolean y;

        /* JADX INFO: renamed from: hb2$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0138QnHx<T> implements gb2<T> {
            public final gb2<? super T> w;
            public final AtomicReference<vl0> x;

            public C0138QnHx(gb2<? super T> gb2Var, AtomicReference<vl0> atomicReference) {
                this.w = gb2Var;
                this.x = atomicReference;
            }

            @Override // defpackage.gb2
            public final void b() {
                this.w.b();
            }

            @Override // defpackage.gb2
            public final void c(vl0 vl0Var) {
                bm0.n(this.x, vl0Var);
            }

            @Override // defpackage.gb2
            public final void onError(Throwable th) {
                this.w.onError(th);
            }

            @Override // defpackage.gb2
            public final void onSuccess(T t) {
                this.w.onSuccess(t);
            }
        }

        public QnHx(gb2<? super T> gb2Var, i91<? super Throwable, ? extends jb2<? extends T>> i91Var, boolean z) {
            this.w = gb2Var;
            this.x = i91Var;
            this.y = z;
        }

        @Override // defpackage.vl0
        public final void a() {
            bm0.c(this);
        }

        @Override // defpackage.gb2
        public final void b() {
            this.w.b();
        }

        @Override // defpackage.gb2
        public final void c(vl0 vl0Var) {
            if (bm0.n(this, vl0Var)) {
                this.w.c(this);
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return bm0.d(get());
        }

        @Override // defpackage.gb2
        public final void onError(Throwable th) {
            boolean z = this.y;
            gb2<? super T> gb2Var = this.w;
            if (!z && !(th instanceof Exception)) {
                gb2Var.onError(th);
                return;
            }
            try {
                jb2<? extends T> jb2VarApply = this.x.apply(th);
                mq2.b(jb2VarApply, "The resumeFunction returned a null MaybeSource");
                jb2<? extends T> jb2Var = jb2VarApply;
                bm0.g(this, null);
                jb2Var.a(new C0138QnHx(gb2Var, this));
            } catch (Throwable th2) {
                XTd3.w(th2);
                gb2Var.onError(new CompositeException(th, th2));
            }
        }

        @Override // defpackage.gb2
        public final void onSuccess(T t) {
            this.w.onSuccess(t);
        }
    }

    public hb2(kb2 kb2Var, k71 k71Var) {
        super(kb2Var);
        this.x = k71Var;
        this.y = true;
    }

    @Override // defpackage.xa2
    public final void b(gb2<? super T> gb2Var) {
        this.w.a(new QnHx(gb2Var, this.x, this.y));
    }
}
