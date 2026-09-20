package defpackage;

import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;

/* JADX INFO: loaded from: classes.dex */
public final class dv2 extends wn5 {

    public static final class QnHx extends wn5.QnHx<QnHx, dv2> {
        public QnHx(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.b.d = OverwritingInputMerger.class.getName();
        }
    }

    public dv2(QnHx qnHx) {
        super(qnHx.a, qnHx.b, qnHx.c);
    }
}
