package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.BatteryManager;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import javax.inject.Singleton;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@Singleton
public final class C1142aD extends C04046m {
    public static byte[] A01;
    public static String[] A02 = {"bPMdIRdGv", "GS1RiQ0Fe2OXcQcIkCuEDku7WILZ5IDY", "TsFhxeN3ooiOzKyGYimy4dCB8t9rX6Qk", "tDBwPFCmRryD0Q4apJFJlrgk6DNKamUD", "oUUA5cBoIxHqACzkd5Y2T9kUvSWODdEm", "FnX3lwsUZnwMMkDv8sp6DIbywwAIHXWj", "YZLb9o623eUfyZOuivTCDkgv5wbAGsEp", "CfH0aVj4RQl6Eoew8HOriE9Hjjy"};
    public final BatteryManager A00;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 124);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-7, 19, 18, 37, 37, 22, 35, 42, 30, 18, 31, 18, 24, 22, 35, 42, -11, -18, -1, -18, -11, 60, 81, 0, -16, -18, -7, -14};
    }

    static {
        A02();
    }

    public C1142aD(Context context, C6C c6c) {
        super(context, c6c);
        this.A00 = (BatteryManager) context.getSystemService(A01(1, 14, 53));
    }

    public final InterfaceC04136v A0G() {
        return new C1150aL(this);
    }

    public final InterfaceC04136v A0H() {
        return new C1144aF(this);
    }

    public final InterfaceC04136v A0I() {
        HashMap map = new HashMap();
        map.put(A01(21, 1, 82), 2);
        map.put(A01(0, 1, 28), 3);
        return new C1145aG(this, map);
    }

    public final InterfaceC04136v A0J() {
        HashMap map = new HashMap();
        map.put(A01(15, 1, 66), A01(16, 5, 13));
        map.put(A01(22, 1, 98), A01(23, 5, 17));
        return new C1155aQ(this, map);
    }

    public final InterfaceC04136v A0K() {
        return new C1147aI(this);
    }

    public final InterfaceC04136v A0L() {
        return new C1152aN(this);
    }

    public final InterfaceC04136v A0M() {
        return new C1149aK(this);
    }

    public final InterfaceC04136v A0N() {
        return new C1143aE(this);
    }

    public final InterfaceC04136v A0O() {
        return new C1151aM(this);
    }

    public final InterfaceC04136v A0P() {
        return new C1154aP(this);
    }

    public final InterfaceC04136v A0Q() {
        return new C1148aJ(this);
    }

    public final InterfaceC04136v A0R() {
        return new C1153aO(this);
    }

    public final InterfaceC04136v A0S() {
        return new C1146aH(this);
    }

    public final C7A A0T(int i) {
        if (Build.VERSION.SDK_INT < 21) {
            return A07(AnonymousClass76.A05);
        }
        BatteryManager batteryManager = this.A00;
        if (A02[4].charAt(5) != 'c') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[3] = "Z0BpikLZimvh7GQ0e0YfQZg6u7WmYRcx";
        strArr[6] = "N2CtCcOuXuTLuGr2kU7dW0gd7w3dfDGl";
        if (batteryManager != null) {
            return A04(batteryManager.getIntProperty(i));
        }
        return A07(AnonymousClass76.A07);
    }

    @SuppressLint({"Nullable Dereference"})
    public final C7A A0U(HashMap<String, Integer> resultMap) {
        if (Build.VERSION.SDK_INT < 21) {
            return A07(AnonymousClass76.A05);
        }
        BatteryManager batteryManager = this.A00;
        if (A02[4].charAt(5) != 'c') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[3] = "VX9OpHMsf9E36khSHc5jiQggPTjCMNcl";
        strArr[6] = "9ZxqnrvyvCCPPfnmtmMIQlgDqEWsMyB8";
        if (batteryManager != null) {
            Set<String> setKeySet = resultMap.keySet();
            HashMap<String, Integer> map = new HashMap<>();
            for (String str : setKeySet) {
                map.put(str, Integer.valueOf(this.A00.getIntProperty(resultMap.get(str).intValue())));
            }
            return A0C(map);
        }
        return A07(AnonymousClass76.A07);
    }
}
