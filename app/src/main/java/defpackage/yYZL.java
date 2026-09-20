package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class yYZL implements qe5 {
    public final Context a;

    public yYZL(Context context) {
        this.a = context;
    }

    @Override // defpackage.qe5
    public final void a(String str) {
        this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }
}
