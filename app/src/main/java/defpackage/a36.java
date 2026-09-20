package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.NUlFixed;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final class a36 {
    public static final int a = Runtime.getRuntime().availableProcessors();

    public static int a(Bundle bundle, String str) {
        if (bundle == null) {
            f(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            e(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        String name = obj.getClass().getName();
        f(str, name.length() != 0 ? "Unexpected type for bundle response code: ".concat(name) : new String("Unexpected type for bundle response code: "));
        return 6;
    }

    public static Bundle b(int i, boolean z, String str, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        if (i >= 9) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        if (i >= 9 && z) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (i >= 14) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            ArrayList<String> arrayList3 = new ArrayList<>();
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            boolean z2 = false;
            boolean z3 = false;
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(null);
                z2 |= !TextUtils.isEmpty(null);
                arrayList3.add(null);
                z3 |= !TextUtils.isEmpty(null);
                arrayList4.add(0);
            }
            if (z2) {
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
            }
            if (z3) {
                bundle.putStringArrayList("SKU_OFFER_ID_LIST", arrayList3);
            }
        }
        return bundle;
    }

    public static NUlFixed c(Intent intent, String str) {
        if (intent == null) {
            f("BillingHelper", "Got null intent!");
            NUlFixed nUl = new NUlFixed();
            nUl.a = 6;
            nUl.b = "An internal error occurred.";
            return nUl;
        }
        int iA = a(intent.getExtras(), str);
        String strD = d(intent.getExtras(), str);
        NUlFixed nUl2 = new NUlFixed();
        nUl2.a = iA;
        nUl2.b = strD;
        return nUl2;
    }

    public static String d(Bundle bundle, String str) {
        if (bundle == null) {
            f(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            e(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        String name = obj.getClass().getName();
        f(str, name.length() != 0 ? "Unexpected type for debug message: ".concat(name) : new String("Unexpected type for debug message: "));
        return "";
    }

    public static void e(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            Log.v(str, str2);
        }
    }

    public static void f(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void g(String str, String str2, Exception exc) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2, exc);
        }
    }

    public static Purchase h(String str, String str2) {
        if (str == null || str2 == null) {
            e("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e) {
            f("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
            return null;
        }
    }
}
