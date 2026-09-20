package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i57 {
    public static final Uri e = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public i57(String str, int i, String str2, boolean z) {
        oa3.e(str);
        this.a = str;
        oa3.e(str2);
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    public final Intent a(Context context) {
        Bundle bundleCall;
        Intent intent = null;
        String str = this.a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.d) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", str);
            try {
                bundleCall = context.getContentResolver().call(e, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e2) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e2.toString()));
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
            }
        }
        return intent != null ? intent : new Intent(str).setPackage(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i57)) {
            return false;
        }
        i57 i57Var = (i57) obj;
        return tq2.a(this.a, i57Var.a) && tq2.a(this.b, i57Var.b) && tq2.a(null, null) && this.c == i57Var.c && this.d == i57Var.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, Integer.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        oa3.h(null);
        throw null;
    }
}
