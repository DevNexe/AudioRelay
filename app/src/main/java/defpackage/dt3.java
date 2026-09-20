package defpackage;

import android.content.Context;
import android.content.Intent;
import com.azefsw.audioconnect.root.ui.RootActivity;

/* JADX INFO: loaded from: classes.dex */
public final class dt3 implements cOm3Fixed {
    public final Context a;

    public dt3(Context context) {
        this.a = context;
    }

    @Override // defpackage.cOm3Fixed
    public final void a() {
        Context context = this.a;
        context.startActivity(new Intent(context, (Class<?>) RootActivity.class).addFlags(268468224));
    }
}
