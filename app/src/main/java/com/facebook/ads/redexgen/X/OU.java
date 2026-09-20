package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.RewardData;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class OU extends FrameLayout {
    public static String[] A07 = {"Lu0oG19N", "JNY", "Ev6F9eDhg42RHlCeRuJfEtiFO07AluFn", "qSbaO4FE34QcNqD1YWxCxyT8wr5s9kWw", "hZddA1hSD7Y", "v9TnLSaOxYneacolptRVdRHaZQ0ab06L", "iyW9tyIIQvF7WQz3LOxNHXxa074IcWbN", "vzh"};

    @Nullable
    public AbstractC0784Mp A00;
    public final AnonymousClass18 A01;
    public final C1075Xy A02;
    public final InterfaceC0785Mq A03;
    public final OT A04;

    @Nullable
    public final QK A05;
    public final View[] A06;

    public OU(C0830Oj c0830Oj, AnonymousClass18 anonymousClass18, @Nullable QK qk, C0693Ix c0693Ix, OJ oj, InterfaceC0785Mq interfaceC0785Mq, OT ot) {
        this(c0830Oj, anonymousClass18, qk, interfaceC0785Mq, ot, c0693Ix, oj);
    }

    public OU(C0830Oj c0830Oj, AnonymousClass18 anonymousClass18, @Nullable QK qk, InterfaceC0785Mq interfaceC0785Mq, OT ot, View... viewArr) {
        this(c0830Oj.A05(), c0830Oj.A08(), anonymousClass18, qk, interfaceC0785Mq, ot, viewArr);
    }

    public OU(C1075Xy c1075Xy, @Nullable AbstractC0784Mp abstractC0784Mp, AnonymousClass18 anonymousClass18, @Nullable QK qk, InterfaceC0785Mq interfaceC0785Mq, OT ot, View... viewArr) {
        super(c1075Xy);
        this.A02 = c1075Xy;
        this.A00 = abstractC0784Mp;
        this.A01 = anonymousClass18;
        this.A06 = viewArr;
        this.A03 = interfaceC0785Mq;
        this.A05 = qk;
        this.A04 = ot;
        A03();
    }

    private void A03() {
        String title;
        RewardData rewardDataA0M = this.A01.A0M();
        if (rewardDataA0M == null) {
            title = this.A01.A0Q().A05();
        } else {
            title = this.A01.A0Q().A06(rewardDataA0M.getCurrency(), rewardDataA0M.getQuantity());
        }
        C0794Mz c0794Mz = new C0794Mz(this.A02, -1, -16777216, title, null, this.A01.A0Q().A04(), this.A01.A0Q().A03(), C0770Mb.A01(EnumC0769Ma.REWARD_ICON));
        c0794Mz.A02.setOnClickListener(new OR(this));
        c0794Mz.A01.setOnClickListener(new OS(this));
        addView(c0794Mz, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        QK qk = this.A05;
        if (qk != null) {
            qk.A0a(Q1.A07);
        }
        this.A04.A9x();
        if (!this.A01.A0O().A0O()) {
            this.A01.A0h(this.A03);
        }
    }

    public final void A07(ViewGroup viewGroup) {
        QK qk = this.A05;
        if (qk != null && !qk.A0j()) {
            this.A05.A0f(false, false, 11);
            MS.A0N(this.A05, 4);
        }
        AbstractC0784Mp abstractC0784Mp = this.A00;
        String[] strArr = A07;
        if (strArr[7].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A07[0] = "vGH3jzSu";
        if (abstractC0784Mp != null) {
            MS.A0H(abstractC0784Mp);
        }
        for (View view : this.A06) {
            view.clearAnimation();
            MS.A0N(view, 4);
        }
        viewGroup.addView(this, new RelativeLayout.LayoutParams(-1, -1));
        this.A04.ABQ();
    }
}
