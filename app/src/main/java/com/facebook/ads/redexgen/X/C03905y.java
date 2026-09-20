package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03905y {
    public static String A00;
    public static byte[] A01;
    public static String[] A02 = {"o8zuart55Bmx3Pw0EGryupigSLJoPiZx", "bq35BXrVyo2MmN2pvK0AAoIbsBJXmHFn", "Ag4UQwTEuL9TJhKNxG6", "PmxOul6ExA7xevKGmIJ7", "bJjslG0QPgIDYXjJzGe0RXJuWF5PAt6I", "GLZoSVJacutm5kJ9CSmVpuybEaBnhneX", "dIwLXajRtHFv7I4e8IdUhcaSFtkhp8vw", "TtnuuoV6cihzxwpt43jVepBLS"};
    public static final String A03;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 58);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        byte[] bArr = {112, 82, 93, 93, 92, 71, 19, 84, 86, 71, 19, 82, 87, 69, 86, 65, 71, 90, 64, 90, 93, 84, 19, 90, 93, 85, 92, 19, 92, 93, 19, 94, 82, 90, 93, 19, 71, 91, 65, 86, 82, 87, 29, 91, 87, 85, 22, 95, 87, 87, 95, 84, 93, 22, 89, 86, 92, 74, 87, 81, 92, 22, 95, 85, 75, 82, 94, 92, 31, 86, 94, 94, 86, 93, 84, 31, 80, 95, 85, 67, 94, 88, 85, 31, 86, 92, 66, 31, 80, 85, 66, 31, 88, 85, 84, 95, 69, 88, 87, 88, 84, 67, 31, 112, 85, 71, 84, 67, 69, 88, 66, 88, 95, 86, 120, 85, 114, 93, 88, 84, 95, 69, 109, 97, 99, 32, 105, 97, 97, 105, 98, 107, 32, 111, 96, 106, 124, 97, 103, 106, 32, 105, 99, 125, 32, 111, 106, 125, 32, 103, 106, 107, 96, 122, 103, 104, 103, 107, 124, 32, 125, 107, 124, 120, 103, 109, 107, 32, 93, 90, 79, 92, 90, 18, 30, 28, 95, 22, 30, 30, 22, 29, 20, 95, 16, 31, 21, 3, 30, 24, 21, 95, 22, 28, 2, 95, 18, 30, 28, 28, 30, 31, 95, 54, 30, 30, 22, 29, 20, 33, 29, 16, 8, 34, 20, 3, 7, 24, 18, 20, 2, 36, 5, 24, 29, 67, 65, 74, 65, 86, 77, 71, 106, 104, 121, 76, 105, 123, 104, 127, 121, 100, 126, 100, 99, 106, 68, 105, 68, 99, 107, 98, 123, 121, 104, 85, 120, 33, 59, 15, 39, 39, 47, 36, 45, 24, 36, 41, 49, 27, 45, 58, 62, 33, 43, 45, 59, 9, 62, 41, 33, 36, 41, 42, 36, 45, 43, 49, 14, 43, 47, 43, 54, 3, 38, 22, 48, 35, 33, 41, 43, 44, 37, 7, 44, 35, 32, 46, 39, 38};
        if (A02[0].charAt(25) != 'L') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[7] = "5c2qL4dH8BvO0Uzn9h0t1hzuT";
        strArr[3] = "iopOujFX2mYmGwDZvEry";
        A01 = bArr;
    }

    static {
        A05();
        A03 = C03835q.class.getSimpleName();
        A00 = A04(173, 52, 75);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    @Nullable
    public static C03835q A00(C8U c8u) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C03835q c03835qA01 = A01(c8u);
            if (c03835qA01 != null) {
                boolean zIsEmpty = TextUtils.isEmpty(c03835qA01.A03());
                if (A02[0].charAt(25) != 'L') {
                    throw new RuntimeException();
                }
                A02[4] = "uy9l7RLQ2P1HyKRuXc5qKTdvpqbxTZwF";
                if (zIsEmpty) {
                    c03835qA01 = A02(c8u);
                }
            } else {
                c03835qA01 = A02(c8u);
            }
            if (c03835qA01 == null || TextUtils.isEmpty(c03835qA01.A03())) {
                return A03(c8u);
            }
            return c03835qA01;
        }
        throw new IllegalStateException(A04(0, 43, 9));
    }

    @Nullable
    @VisibleForTesting
    public static C03835q A01(C8U c8u) {
        C8Y c8yA7K = c8u.A03().A7K();
        if (c8yA7K != null) {
            return new C03835q(c8yA7K.getId(), c8yA7K.A8Y(), EnumC03825p.A03);
        }
        return null;
    }

    @Nullable
    @VisibleForTesting
    public static C03835q A02(C8U c8u) {
        Object objA00;
        Method methodA02;
        Object objA01;
        Method methodA03 = C03915z.A02(A00, A04(257, 29, 114), Context.class);
        if (methodA03 == null || (objA00 = C03915z.A00(null, methodA03, c8u)) == null || ((Integer) objA00).intValue() != 0 || (methodA02 = C03915z.A02(A04(65, 57, 11), A04(232, 20, 55), Context.class)) == null || (objA01 = C03915z.A00(null, methodA02, c8u)) == null) {
            return null;
        }
        Method methodA01 = C03915z.A01(objA01.getClass(), A04(252, 5, 38), new Class[0]);
        Method getId = C03915z.A01(objA01.getClass(), A04(286, 24, 120), new Class[0]);
        if (methodA01 == null || getId == null) {
            return null;
        }
        Object advertisingInfo = C03915z.A00(objA01, methodA01, new Object[0]);
        String str = (String) advertisingInfo;
        Boolean bool = (Boolean) C03915z.A00(objA01, getId, new Object[0]);
        if (str != null) {
            return new C03835q(str, bool != null && bool.booleanValue(), EnumC03825p.A07);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.facebook.ads.internal.attribution.GmsAttributionProvider$GoogleAdInfo] */
    @Nullable
    @SuppressLint({"CatchGeneralException"})
    @VisibleForTesting
    public static C03835q A03(C8U c8u) {
        ServiceConnectionC03895x serviceConnectionC03895x = new ServiceConnectionC03895x();
        Intent intent = new Intent(A04(122, 51, 52));
        intent.setPackage(A04(43, 22, 2));
        if (c8u.bindService(intent, serviceConnectionC03895x, 1)) {
            try {
                final IBinder iBinderA02 = serviceConnectionC03895x.A02();
                ?? r0 = new IInterface(iBinderA02) { // from class: com.facebook.ads.internal.attribution.GmsAttributionProvider$GoogleAdInfo
                    public static byte[] A01;
                    public static String[] A02 = {"", "dlCQJjSx2v0yIAE7uR5", "YVJONne7N3U8xm", "", "eKTK4BSI8P33PVYq98zfXeBzSnXDY", "", "Oc9p6kWmaRe51UGQv0AehnzsYEIJ", "vamZVSY5oxMc9Fm9XA4FwhL"};
                    public IBinder A00;

                    public static String A00(int i, int i2, int i3) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                        int i4 = 0;
                        while (true) {
                            int length = bArrCopyOfRange.length;
                            String[] strArr = A02;
                            if (strArr[5].length() != strArr[0].length()) {
                                throw new RuntimeException();
                            }
                            A02[3] = "";
                            if (i4 >= length) {
                                return new String(bArrCopyOfRange);
                            }
                            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 80);
                            i4++;
                        }
                    }

                    public static void A01() {
                        A01 = new byte[]{42, 54, 52, -11, 46, 54, 54, 46, 51, 44, -11, 40, 53, 43, 57, 54, 48, 43, -11, 46, 52, 58, -11, 40, 43, 58, -11, 48, 43, 44, 53, 59, 48, 45, 48, 44, 57, -11, 48, 53, 59, 44, 57, 53, 40, 51, -11, 16, 8, 43, 61, 44, 57, 59, 48, 58, 48, 53, 46, 16, 43, 26, 44, 57, 61, 48, 42, 44};
                    }

                    static {
                        A01();
                    }

                    {
                        this.A00 = iBinderA02;
                    }

                    public final String A02() throws RemoteException {
                        Parcel reply = Parcel.obtain();
                        Parcel parcelObtain = Parcel.obtain();
                        try {
                            reply.writeInterfaceToken(A00(0, 68, 119));
                            this.A00.transact(1, reply, parcelObtain, 0);
                            parcelObtain.readException();
                            String string = parcelObtain.readString();
                            parcelObtain.recycle();
                            reply.recycle();
                            return string != null ? string : A00(0, 0, 88);
                        } catch (Throwable th) {
                            parcelObtain.recycle();
                            reply.recycle();
                            throw th;
                        }
                    }

                    public final boolean A03() throws RemoteException {
                        Parcel reply = Parcel.obtain();
                        Parcel parcelObtain = Parcel.obtain();
                        try {
                            reply.writeInterfaceToken(A00(0, 68, 119));
                            boolean z = true;
                            reply.writeInt(1);
                            this.A00.transact(2, reply, parcelObtain, 0);
                            parcelObtain.readException();
                            if (parcelObtain.readInt() == 0) {
                                z = false;
                            }
                            return z;
                        } finally {
                            parcelObtain.recycle();
                            reply.recycle();
                        }
                    }

                    @Override // android.os.IInterface
                    public final IBinder asBinder() {
                        return this.A00;
                    }
                };
                C03835q c03835q = new C03835q(r0.A02(), r0.A03(), EnumC03825p.A08);
                c8u.unbindService(serviceConnectionC03895x);
                return c03835q;
            } catch (Throwable th) {
                try {
                    c8u.A06().A8y(A04(225, 7, 30), C04578z.A1Q, new AnonymousClass90(th));
                } finally {
                    c8u.unbindService(serviceConnectionC03895x);
                }
            }
        }
        return null;
    }
}
