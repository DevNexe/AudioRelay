package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioManager;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1156aR extends C04046m {
    public static byte[] A01;
    public final AudioManager A00;

    static {
        A05();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 33);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{-22, -2, -19, -14, -8};
    }

    public C1156aR(Context context, C6C c6c) {
        super(context, c6c);
        this.A00 = (AudioManager) context.getSystemService(A04(0, 5, 104));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public C7A A03(HashMap<Integer, C1157aS> map) {
        return new Y7(SystemClock.elapsedRealtime(), A02(), map, AnonymousClass79.A06);
    }

    public final InterfaceC04136v A0G() {
        return new C1159aU(this);
    }

    public final InterfaceC04136v A0H() {
        return new C1162aX(this);
    }

    public final InterfaceC04136v A0I() {
        return new C1161aW(this);
    }

    public final InterfaceC04136v A0J() {
        return new C1160aV(this);
    }

    public final InterfaceC04136v A0K(List<C04126u> list) {
        return new C1158aT(this, list);
    }
}
