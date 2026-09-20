package defpackage;

import android.content.Context;
import androidx.work.impl.model.WorkSpec;

/* JADX INFO: loaded from: classes.dex */
public final class q9 extends y60<Boolean> {
    public q9(Context context, c15 c15Var) {
        super((r9) j95.a(context, c15Var).a);
    }

    @Override // defpackage.y60
    public final boolean b(WorkSpec workSpec) {
        return workSpec.j.b;
    }

    @Override // defpackage.y60
    public final boolean c(Boolean bool) {
        return !bool.booleanValue();
    }
}
