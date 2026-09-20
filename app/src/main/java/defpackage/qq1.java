package defpackage;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qq1 implements i91 {
    public final /* synthetic */ int w = 0;
    public final /* synthetic */ sq1 x;
    public final /* synthetic */ Activity y;

    public /* synthetic */ qq1(Activity activity, sq1 sq1Var) {
        this.y = activity;
        this.x = sq1Var;
    }

    public /* synthetic */ qq1(sq1 sq1Var, Activity activity) {
        this.x = sq1Var;
        this.y = activity;
    }

    @Override // defpackage.i91
    public final Object apply(Object obj) {
        int i = this.w;
        Activity activity = this.y;
        sq1 sq1Var = this.x;
        switch (i) {
            case 0:
                return ((wq1) obj).a(activity, new uq1(sq1Var));
            default:
                return sq1Var.e(activity, (sq1.QnHx) obj);
        }
    }
}
