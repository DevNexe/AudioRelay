package defpackage;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: loaded from: classes3.dex */
public final class ja6 implements DialogInterface.OnClickListener {
    public final /* synthetic */ JsResult w;

    public ja6(JsResult jsResult) {
        this.w = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.w.confirm();
    }
}
