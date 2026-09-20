package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4P, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C4P {
    public static byte[] A06;
    public static String[] A07 = {"wCFFy4v0UHolBGzubHhtaTK0KlaK5TU8", "WXL", "veTi", "n3", "rW28yUWMMTgiQlEcIz6smwE3e87Fn5Ax", "QU5acghFPGL2KQJts4swUt9W5A9MK8iM", "qIZlYUWuFA6tmX766BSANKSPkXlWbMWT", "RhPzJuizv3JTUr3AZhw4zLdz5ZpO"};
    public C4N A04 = null;
    public ArrayList<RecyclerView.ItemAnimator.ItemAnimatorFinishedListener> A05 = new ArrayList<>();
    public long A00 = 120;
    public long A03 = 120;
    public long A02 = 250;
    public long A01 = 250;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 42);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{85, 84, 123, 84, 83, 87, 91, 78, 83, 85, 84, 73, 124, 83, 84, 83, 73, 82, 95, 94};
    }

    public abstract boolean A0E(@NonNull AbstractC03524l abstractC03524l, @Nullable C4O c4o, @NonNull C4O c4o2);

    public abstract boolean A0F(@NonNull AbstractC03524l abstractC03524l, @NonNull C4O c4o, @Nullable C4O c4o2);

    public abstract boolean A0G(@NonNull AbstractC03524l abstractC03524l, @NonNull C4O c4o, @NonNull C4O c4o2);

    public abstract boolean A0H(@NonNull AbstractC03524l abstractC03524l, @NonNull AbstractC03524l abstractC03524l2, @NonNull C4O c4o, @NonNull C4O c4o2);

    public abstract void A0I();

    public abstract void A0J();

    public abstract void A0K(AbstractC03524l abstractC03524l);

    public abstract boolean A0L();

    static {
        A03();
    }

    public static int A00(AbstractC03524l abstractC03524l) {
        int pos = abstractC03524l.A0C & 14;
        if (abstractC03524l.A0b()) {
            return 4;
        }
        if ((pos & 4) == 0) {
            int iA0J = abstractC03524l.A0J();
            int iA0G = abstractC03524l.A0G();
            String[] strArr = A07;
            String str = strArr[3];
            String str2 = strArr[1];
            int length = str.length();
            int oldPos = str2.length();
            if (length == oldPos) {
                throw new RuntimeException();
            }
            A07[0] = "z6mPnscAmNwlAliMzxZ9cFQDVALsWjfG";
            if (iA0J != -1 && iA0G != -1 && iA0J != iA0G) {
                return pos | 2048;
            }
            return pos;
        }
        return pos;
    }

    private final C4O A01() {
        return new C4O();
    }

    public final long A04() {
        return this.A00;
    }

    public final long A05() {
        return this.A01;
    }

    public final long A06() {
        return this.A02;
    }

    public final long A07() {
        return this.A03;
    }

    @NonNull
    public final C4O A08(@NonNull C03494i c03494i, @NonNull AbstractC03524l abstractC03524l) {
        return A01().A01(abstractC03524l);
    }

    @NonNull
    public final C4O A09(@NonNull C03494i c03494i, @NonNull AbstractC03524l abstractC03524l, int i, @NonNull List<Object> list) {
        return A01().A01(abstractC03524l);
    }

    public final void A0A() {
        int i = this.A05.size();
        if (0 < i) {
            this.A05.get(0);
            throw new NullPointerException(A02(0, 20, 16));
        }
        this.A05.clear();
    }

    public final void A0B(C4N c4n) {
        this.A04 = c4n;
    }

    public final void A0C(AbstractC03524l abstractC03524l) {
        C4N c4n = this.A04;
        if (c4n != null) {
            c4n.A9z(abstractC03524l);
        }
    }

    public boolean A0D(@NonNull AbstractC03524l abstractC03524l) {
        return true;
    }

    public boolean A0M(@NonNull AbstractC03524l abstractC03524l, @NonNull List<Object> list) {
        return A0D(abstractC03524l);
    }
}
