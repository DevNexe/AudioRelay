package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.YKK;
import androidx.lifecycle.auxFixed;
import defpackage.d32;
import defpackage.hu2;
import defpackage.vm;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    public final Runnable a;
    public final ArrayDeque<hu2> b = new ArrayDeque<>();

    public class LifecycleOnBackPressedCancellable implements auxFixed, vm {
        public final YKK w;
        public final hu2 x;
        public QnHx y;

        public LifecycleOnBackPressedCancellable(YKK ykk, hu2 hu2Var) {
            this.w = ykk;
            this.x = hu2Var;
            ykk.a(this);
        }

        @Override // defpackage.vm
        public final void cancel() {
            this.w.c(this);
            this.x.b.remove(this);
            QnHx qnHx = this.y;
            if (qnHx != null) {
                qnHx.cancel();
                this.y = null;
            }
        }

        @Override // androidx.lifecycle.auxFixed
        public final void h(d32 d32Var, YKK.CQf cQf) {
            if (cQf == YKK.CQf.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                ArrayDeque<hu2> arrayDeque = onBackPressedDispatcher.b;
                hu2 hu2Var = this.x;
                arrayDeque.add(hu2Var);
                QnHx qnHx = onBackPressedDispatcher.new QnHx(hu2Var);
                hu2Var.b.add(qnHx);
                this.y = qnHx;
                return;
            }
            if (cQf != YKK.CQf.ON_STOP) {
                if (cQf == YKK.CQf.ON_DESTROY) {
                    cancel();
                }
            } else {
                QnHx qnHx2 = this.y;
                if (qnHx2 != null) {
                    qnHx2.cancel();
                }
            }
        }
    }

    public class QnHx implements vm {
        public final hu2 w;

        public QnHx(hu2 hu2Var) {
            this.w = hu2Var;
        }

        @Override // defpackage.vm
        public final void cancel() {
            ArrayDeque<hu2> arrayDeque = OnBackPressedDispatcher.this.b;
            hu2 hu2Var = this.w;
            arrayDeque.remove(hu2Var);
            hu2Var.b.remove(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    public final void a(d32 d32Var, hu2 hu2Var) {
        YKK ykkC = d32Var.c();
        if (ykkC.b() == YKK.F1.DESTROYED) {
            return;
        }
        hu2Var.b.add(new LifecycleOnBackPressedCancellable(ykkC, hu2Var));
    }

    public final void b() {
        Iterator<hu2> itDescendingIterator = this.b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            hu2 next = itDescendingIterator.next();
            if (next.a) {
                next.a();
                return;
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
