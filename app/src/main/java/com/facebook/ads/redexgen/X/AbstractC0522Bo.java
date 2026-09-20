package com.facebook.ads.redexgen.X;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0522Bo implements VS {
    public static String[] A06 = {"xrToQ1M30eypgaiDt2KcbeXQSJmH4zEy", "FOMm0GJvPogulFgRKU73d9QQGInBRxBZ", "DAifx7fz7Oznb", "tEspMkbIuGZVzgapMfnbK02RMeMH6P5b", "hnmT", "jbKY175w2AZdEkpyONR9SNFucMTvW6Vd", "vt70xpgsPpIXmuxmiV", "wsDuhCL"};
    public long A00;
    public long A01;
    public AnonymousClass30 A02;
    public final ArrayDeque<AnonymousClass30> A03 = new ArrayDeque<>();
    public final ArrayDeque<AbstractC0523Bp> A04;
    public final PriorityQueue<AnonymousClass30> A05;

    public abstract GY A0L();

    public abstract void A0P(C0531Bx c0531Bx);

    public abstract boolean A0R();

    public AbstractC0522Bo() {
        for (int i = 0; i < 10; i++) {
            this.A03.add(new AnonymousClass30());
        }
        this.A04 = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.A04.add(new C03162z(this));
        }
        this.A05 = new PriorityQueue<>();
    }

    private void A0K(AnonymousClass30 anonymousClass30) {
        anonymousClass30.A07();
        this.A03.add(anonymousClass30);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0529Bv
    /* JADX INFO: renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public C0531Bx A4k() throws GZ {
        IK.A04(this.A02 == null);
        if (this.A03.isEmpty()) {
            return null;
        }
        this.A02 = this.A03.pollFirst();
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0529Bv
    /* JADX INFO: renamed from: A0N, reason: merged with bridge method [inline-methods] */
    public AbstractC0523Bp A4l() throws GZ {
        if (this.A04.isEmpty()) {
            return null;
        }
        while (!this.A05.isEmpty() && ((X2) this.A05.peek()).A00 <= this.A00) {
            AnonymousClass30 anonymousClass30Poll = this.A05.poll();
            if (anonymousClass30Poll.A04()) {
                AbstractC0523Bp abstractC0523BpPollFirst = this.A04.pollFirst();
                abstractC0523BpPollFirst.A00(4);
                if (A06[6].length() != 18) {
                    throw new RuntimeException();
                }
                A06[4] = "hAEA";
                A0K(anonymousClass30Poll);
                return abstractC0523BpPollFirst;
            }
            A0P(anonymousClass30Poll);
            if (A0R()) {
                GY gyA0L = A0L();
                if (!anonymousClass30Poll.A03()) {
                    AbstractC0523Bp abstractC0523BpPollFirst2 = this.A04.pollFirst();
                    abstractC0523BpPollFirst2.A09(((X2) anonymousClass30Poll).A00, gyA0L, Long.MAX_VALUE);
                    A0K(anonymousClass30Poll);
                    return abstractC0523BpPollFirst2;
                }
            }
            A0K(anonymousClass30Poll);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0529Bv
    /* JADX INFO: renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public void ADW(C0531Bx c0531Bx) throws GZ {
        IK.A03(c0531Bx == this.A02);
        if (c0531Bx.A03()) {
            AnonymousClass30 anonymousClass30 = this.A02;
            String[] strArr = A06;
            if (strArr[5].charAt(10) != strArr[3].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[5] = "0mhI93daunZi59PwiuGO0KbLyKVCPwQH";
            strArr2[3] = "r2E3xZENv7Zr1SQt92aJBQoSxSc5nrbU";
            A0K(anonymousClass30);
        } else {
            AnonymousClass30 anonymousClass31 = this.A02;
            long j = this.A01;
            this.A01 = 1 + j;
            anonymousClass31.A00 = j;
            this.A05.add(this.A02);
        }
        this.A02 = null;
    }

    public final void A0Q(AbstractC0523Bp abstractC0523Bp) {
        abstractC0523Bp.A07();
        this.A04.add(abstractC0523Bp);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0529Bv
    public void ADm() {
    }

    @Override // com.facebook.ads.redexgen.X.VS
    public void AEg(long j) {
        this.A00 = j;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0529Bv
    public void flush() {
        this.A01 = 0L;
        this.A00 = 0L;
        while (!this.A05.isEmpty()) {
            A0K(this.A05.poll());
        }
        AnonymousClass30 anonymousClass30 = this.A02;
        if (anonymousClass30 != null) {
            A0K(anonymousClass30);
            this.A02 = null;
        }
    }
}
