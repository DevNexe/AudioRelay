package defpackage;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.QnHx;

/* JADX INFO: loaded from: classes.dex */
public final class jn5 implements j51 {
    public final c15 a;
    public final i51 b;
    public final QnHx c;

    static {
        s52.e("WMFgUpdater");
    }

    public jn5(WorkDatabase workDatabase, i51 i51Var, c15 c15Var) {
        this.b = i51Var;
        this.a = c15Var;
        this.c = workDatabase.n();
    }
}
