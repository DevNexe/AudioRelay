package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class gu4 implements eu4 {
    public final Context a;

    public gu4(Context context) {
        this.a = context;
    }

    @Override // defpackage.eu4
    public final sx a(String str) {
        final String strA = b70.a("market://", "details?id=".concat(str));
        return new sx(new fx(new ec2(4, this, strA)), new i91() { // from class: fu4
            public final /* synthetic */ boolean y = true;

            @Override // defpackage.i91
            public final Object apply(Object obj) {
                return new fx(new z0(5, this.w, iv4.v(strA, "market://", this.y ? "https://play.google.com/store/apps/" : "https://play.google.com/store/")));
            }
        });
    }
}
