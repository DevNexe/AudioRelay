package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a76 {
    public static final HashSet a = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));
    public static final List b = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
    public static final List c = Arrays.asList("auto", "app", "am");
    public static final List d = Arrays.asList("_r", "_dbg");
    public static final List e;
    public static final List f;

    static {
        String[][] strArr = {fXUx.B, fXUx.C};
        int length = 0;
        for (int i = 0; i < 2; i++) {
            length += strArr[i].length;
        }
        Object[] objArrCopyOf = Arrays.copyOf(strArr[0], length);
        int length2 = strArr[0].length;
        String[] strArr2 = strArr[1];
        System.arraycopy(strArr2, 0, objArrCopyOf, length2, strArr2.length);
        e = Arrays.asList((String[]) objArrCopyOf);
        f = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    public static boolean a(Bundle bundle, String str, String str2) {
        byte b2;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!(!c.contains(str)) || bundle == null) {
            return false;
        }
        Iterator it = d.iterator();
        while (it.hasNext()) {
            if (bundle.containsKey((String) it.next())) {
                return false;
            }
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 101200) {
            if (iHashCode != 101230) {
                if (iHashCode == 3142703 && str.equals("fiam")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("fdl")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("fcm")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        if (b2 == 1) {
            bundle.putString("_cis", "fdl_integration");
            return true;
        }
        if (b2 != 2) {
            return false;
        }
        bundle.putString("_cis", "fiam_integration");
        return true;
    }

    public static boolean b(Bundle bundle, String str) {
        if (b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        Iterator it = d.iterator();
        while (it.hasNext()) {
            if (bundle.containsKey((String) it.next())) {
                return false;
            }
        }
        return true;
    }
}
