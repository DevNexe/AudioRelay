package defpackage;

import android.content.Context;
import androidx.work.impl.model.WorkSpec;

/* JADX INFO: loaded from: classes.dex */
public final class s9 extends y60<Boolean> {
    public s9(Context context, c15 c15Var) {
        super((t9) j95.a(context, c15Var).b);
    }

    @Override // defpackage.y60
    public final boolean b(WorkSpec workSpec) {
        return workSpec.j.d;
    }

    @Override // defpackage.y60
    public final boolean c(Boolean bool) {
        return !bool.booleanValue();
    }
}
