package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class F0 {
    public static byte[] A0F;
    public static String[] A0G = {"8avf0Jibg", "29lNoiTUBE2uYEjX9VQOmTXDz5OY", "iVCyimFGxTrkRtFibV9levDJM5ZeLgZu", "gsRFpTOWHqJbEx7", "Kz1bOIham", "JnXM2eLoSoNer4vADvBB94foIijHhZU8", "txozpLaaBXvdIU5pC59NuAEDTSpBHfjF", "fwU5WNlYuxW7JC9kmXc8msxXEM9ymJ0s"};
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final Handler A06;
    public final Handler A07;
    public final HandlerThread A08;
    public final C0576Eg A09;
    public final F5 A0A;
    public final ArrayList<RunnableC0591Ex> A0B;
    public final ArrayList<RunnableC0591Ex> A0C;
    public final CopyOnWriteArraySet<InterfaceC0587Et> A0D;
    public final DownloadAction.Deserializer[] A0E;

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0G[7].charAt(18) == 'd') {
                throw new RuntimeException();
            }
            A0G[5] = "QeXCOK5E1pPej2TxlzyNK8QEELc16ejC";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 103);
            i4++;
        }
    }

    public static void A0C() {
        A0F = new byte[]{40, 107, 100, 105, 123, 96, 109, 123, 40, 127, 97, 124, 96, 40, 13, 23, 101, 80, 4, 72, 65, 69, 87, 80, 4, 75, 74, 65, 4, 96, 65, 87, 65, 86, 77, 69, 72, 77, 94, 65, 86, 4, 77, 87, 4, 86, 65, 85, 81, 77, 86, 65, 64, 10, 82, 121, 97, 120, 122, 121, 119, 114, 91, 119, 120, 119, 113, 115, 100, 54, 112, 127, 122, 115, 54, 127, 57, 121, 37, 16, 2, 26, 81, 24, 2, 81, 16, 21, 21, 20, 21, 21, 32, 50, 42, 97, 50, 53, 32, 53, 36, 97, 40, 50, 97, 34, 41, 32, 47, 38, 36, 37};
    }

    static {
        A0C();
    }

    public F0(F5 f5, int i, int i2, File file, DownloadAction.Deserializer... deserializerArr) {
        IK.A05(deserializerArr.length > 0, A05(16, 38, 67));
        this.A0A = f5;
        this.A04 = i;
        this.A05 = i2;
        this.A09 = new C0576Eg(file);
        this.A0E = deserializerArr;
        this.A01 = true;
        this.A0C = new ArrayList<>();
        this.A0B = new ArrayList<>();
        Looper looperMyLooper = Looper.myLooper();
        this.A07 = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper);
        this.A08 = new HandlerThread(A05(54, 24, 113));
        this.A08.start();
        this.A06 = new Handler(this.A08.getLooper());
        this.A0D = new CopyOnWriteArraySet<>();
        A08();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RunnableC0591Ex A02(DownloadAction downloadAction) {
        int i = this.A00;
        this.A00 = i + 1;
        RunnableC0591Ex runnableC0591Ex = new RunnableC0591Ex(i, this, downloadAction, this.A05, null);
        this.A0C.add(runnableC0591Ex);
        A0J(A05(78, 13, 22), runnableC0591Ex);
        return runnableC0591Ex;
    }

    private void A08() {
        this.A06.post(new RunnableC0585Er(this));
    }

    private void A09() {
        if (!A0R()) {
            return;
        }
        for (InterfaceC0587Et listener : this.A0D) {
            listener.AAw(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        DownloadAction downloadAction;
        boolean z;
        if (!this.A02 || this.A03) {
            return;
        }
        int i = (this.A01 || this.A0B.size() == this.A04) ? 1 : 0;
        for (int j = 0; j < this.A0C.size(); j++) {
            RunnableC0591Ex runnableC0591Ex = this.A0C.get(j);
            if (runnableC0591Ex.A0E() && ((z = (downloadAction = runnableC0591Ex.A04).A03) || i == 0)) {
                boolean z2 = true;
                for (int i2 = 0; i2 < j; i2++) {
                    RunnableC0591Ex runnableC0591Ex2 = this.A0C.get(i2);
                    DownloadAction action = runnableC0591Ex2.A04;
                    if (action.A09(downloadAction)) {
                        if (!z) {
                            if (runnableC0591Ex2.A04.A03) {
                                z2 = false;
                                i = 1;
                                break;
                            }
                        } else {
                            z2 = false;
                            String str = runnableC0591Ex + A05(0, 14, 111) + runnableC0591Ex2;
                            runnableC0591Ex2.A08();
                        }
                    }
                }
                if (z2) {
                    runnableC0591Ex.A0A();
                    if (!z) {
                        this.A0B.add(runnableC0591Ex);
                        i = this.A0B.size() == this.A04 ? 1 : 0;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        if (this.A03) {
            return;
        }
        DownloadAction[] downloadActionArr = new DownloadAction[this.A0C.size()];
        for (int i = 0; i < i; i++) {
            downloadActionArr[i] = this.A0C.get(i).A04;
        }
        this.A06.post(new RunnableC0586Es(this, downloadActionArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(RunnableC0591Ex runnableC0591Ex) {
        A0J(A05(91, 21, 38), runnableC0591Ex);
        C0593Ez c0593EzA0K = runnableC0591Ex.A0K();
        Iterator<InterfaceC0587Et> it = this.A0D.iterator();
        while (it.hasNext()) {
            it.next().ACV(this, c0593EzA0K);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(RunnableC0591Ex runnableC0591Ex) {
        if (this.A03) {
            return;
        }
        boolean zA0L = runnableC0591Ex.A0L();
        String[] strArr = A0G;
        if (strArr[2].charAt(18) != strArr[6].charAt(18)) {
            throw new RuntimeException();
        }
        A0G[5] = "MuXE9yewg4GnYpwcSobAkjsL3VeJsTJN";
        boolean z = !zA0L;
        if (z) {
            this.A0B.remove(runnableC0591Ex);
        }
        A0D(runnableC0591Ex);
        if (runnableC0591Ex.A0M()) {
            this.A0C.remove(runnableC0591Ex);
            A0B();
        }
        if (z) {
            A0A();
            A09();
        }
    }

    public static void A0J(String str, RunnableC0591Ex runnableC0591Ex) {
        String str2 = str + A05(14, 2, 80) + runnableC0591Ex;
    }

    public final int A0O(DownloadAction downloadAction) {
        IK.A04(!this.A03);
        RunnableC0591Ex runnableC0591ExA02 = A02(downloadAction);
        if (this.A02) {
            A0B();
            A0A();
            if (runnableC0591ExA02.A06 == 0) {
                A0D(runnableC0591ExA02);
            }
        }
        return runnableC0591ExA02.A02;
    }

    public final void A0P() {
        IK.A04(!this.A03);
        if (this.A01) {
            this.A01 = false;
            A0A();
        }
    }

    public final void A0Q(InterfaceC0587Et interfaceC0587Et) {
        this.A0D.add(interfaceC0587Et);
    }

    public final boolean A0R() {
        IK.A04(!this.A03);
        if (!this.A02) {
            return false;
        }
        for (int i = 0; i < this.A0C.size(); i++) {
            if (this.A0C.get(i).A0L()) {
                return false;
            }
        }
        return true;
    }

    public final C0593Ez[] A0S() {
        IK.A04(!this.A03);
        C0593Ez[] c0593EzArr = new C0593Ez[this.A0C.size()];
        for (int i = 0; i < i; i++) {
            c0593EzArr[i] = this.A0C.get(i).A0K();
        }
        return c0593EzArr;
    }
}
