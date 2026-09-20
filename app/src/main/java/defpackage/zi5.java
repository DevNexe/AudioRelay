package defpackage;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class zi5<T extends View> extends X05 {
    public T P;
    public j81<? super Context, ? extends T> Q;
    public j81<? super T, sd5> R;

    public static final class QnHx extends cx1 implements h81<sd5> {
        public final /* synthetic */ zi5<T> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(zi5<T> zi5Var) {
            super(0);
            this.w = zi5Var;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            zi5<T> zi5Var = this.w;
            View typedView$ui_release = zi5Var.getTypedView$ui_release();
            if (typedView$ui_release != null) {
                zi5Var.getUpdateBlock().invoke(typedView$ui_release);
            }
            return sd5.a;
        }
    }

    public zi5(Context context, l40 l40Var, mm2 mm2Var) {
        super(context, l40Var, mm2Var);
        this.R = rG.a;
    }

    public final j81<Context, T> getFactory() {
        return this.Q;
    }

    public /* bridge */ /* synthetic */ byN getSubCompositionView() {
        return null;
    }

    public final T getTypedView$ui_release() {
        return this.P;
    }

    public final j81<T, sd5> getUpdateBlock() {
        return this.R;
    }

    public View getViewRoot() {
        return this;
    }

    public final void setFactory(j81<? super Context, ? extends T> j81Var) {
        this.Q = j81Var;
        if (j81Var != null) {
            T tInvoke = j81Var.invoke(getContext());
            this.P = tInvoke;
            setView$ui_release(tInvoke);
        }
    }

    public final void setTypedView$ui_release(T t) {
        this.P = t;
    }

    public final void setUpdateBlock(j81<? super T, sd5> j81Var) {
        this.R = j81Var;
        setUpdate(new QnHx(this));
    }
}
