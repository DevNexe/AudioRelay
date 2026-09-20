package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class tn1 extends InputConnectionWrapper {
    public final /* synthetic */ vn1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn1(InputConnection inputConnection, sn1 sn1Var) {
        super(inputConnection, false);
        this.a = sn1Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        if (((sn1) this.a).a((inputContentInfo != null && Build.VERSION.SDK_INT >= 25) ? new bo1(new bo1.QnHx(inputContentInfo)) : null, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
