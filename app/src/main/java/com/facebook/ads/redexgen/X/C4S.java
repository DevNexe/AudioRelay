package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.animation.AlphaAnimation;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4S, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C4S extends AbstractC0960Tk<C0895Qw> implements C8S {
    public static String[] A02 = {"iVby5wy6H7l4dzY0Hld0xs9tuHtnGk", "Nr0U5YnFPaRVMsCPPiWFbDdqiRS3TX59", "NmHEOi9mcJk9OQjZmIqLk3AYwOx5ICK3", "j6OxXppfxNxejmkkIb10P2S2ED13bfax", "YxA", "okdCTGqDBxOQkU", "XAA3rxsPdfTGxXL8JCFSxOB2RupP9g", "Mu"};
    public C1075Xy A00;
    public boolean A01;

    public C4S(C0895Qw c0895Qw, C1075Xy c1075Xy) {
        super(c0895Qw);
        this.A00 = c1075Xy;
        this.A01 = false;
    }

    private void A00(int i) {
        if (!this.A01) {
            this.A00.A0D().A38(i);
        }
        String[] strArr = A02;
        if (strArr[0].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        A02[1] = "k6Oe58jhR2JQ133LIP7LsY5lW6eco9l5";
        this.A01 = true;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0077  */
    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        boolean z;
        C0895Qw c0895QwA07 = A07();
        int iIntValue = 0;
        if (c0895QwA07 == null) {
            A00(0);
            return;
        }
        View view = c0895QwA07.A0C;
        AbstractC0894Qv abstractC0894Qv = (AbstractC0894Qv) c0895QwA07.A0E.get();
        int i = 1;
        boolean z2 = view == null;
        if (!z2 && abstractC0894Qv != null) {
            C0896Qx c0896QxA0E = C0895Qw.A0E(view, c0895QwA07.A0A, this.A00);
            boolean viewIsNull = c0896QxA0E.A04();
            if (viewIsNull) {
                C0895Qw.A05(c0895QwA07);
            } else {
                c0895QwA07.A00 = 0;
            }
            boolean z3 = c0895QwA07.A00 > c0895QwA07.A09;
            if (c0895QwA07.A05 == null) {
                z = false;
            } else {
                boolean viewIsNull2 = c0895QwA07.A05.A04();
                if (viewIsNull2) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z3) {
                c0895QwA07.A05 = c0896QxA0E;
            } else {
                boolean viewIsNull3 = c0896QxA0E.A04();
                if (!viewIsNull3) {
                    c0895QwA07.A05 = c0896QxA0E;
                }
            }
            String strValueOf = String.valueOf(c0896QxA0E.A01());
            synchronized (c0895QwA07) {
                boolean viewIsNull4 = c0895QwA07.A06.containsKey(strValueOf);
                if (viewIsNull4) {
                    iIntValue = ((Integer) c0895QwA07.A06.get(strValueOf)).intValue();
                }
                c0895QwA07.A06.put(strValueOf, Integer.valueOf(iIntValue + 1));
            }
            if (z3 && !z) {
                this.A01 = true;
                c0895QwA07.A03 = System.currentTimeMillis();
                boolean viewIsNull5 = c0895QwA07.A07;
                if (viewIsNull5) {
                    this.A00.A0D().A39();
                }
                abstractC0894Qv.A02();
                boolean viewIsNull6 = BuildConfigApi.isDebug();
                if (viewIsNull6) {
                    boolean viewIsNull7 = AdInternalSettings.isVisibleAnimation();
                    if (viewIsNull7) {
                        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                        alphaAnimation.setDuration(500L);
                        view.startAnimation(alphaAnimation);
                    }
                }
                boolean viewIsNull8 = c0895QwA07.A0F;
                if (!viewIsNull8) {
                    return;
                }
            } else if (!z3 && z) {
                this.A01 = true;
                boolean viewIsNull9 = c0895QwA07.A07;
                if (viewIsNull9) {
                    this.A00.A0D().A2f(c0896QxA0E.A02());
                }
                abstractC0894Qv.A00();
            } else {
                abstractC0894Qv.A01();
                boolean viewIsNull10 = this.A01;
                if (!viewIsNull10) {
                    boolean viewIsNull11 = c0895QwA07.A07;
                    if (viewIsNull11) {
                        this.A00.A0D().A37(c0896QxA0E.A02());
                    }
                }
                this.A01 = true;
            }
            boolean viewIsNull12 = c0895QwA07.A08;
            if (!viewIsNull12 && c0895QwA07.A04 != null) {
                c0895QwA07.A0B.postDelayed(c0895QwA07.A04, c0895QwA07.A02);
                return;
            }
            return;
        }
        boolean viewIsNull13 = c0895QwA07.A07;
        if (viewIsNull13) {
            if (!z2) {
                i = 2;
            }
            A00(i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C8S
    public final C1075Xy A5b() {
        return this.A00;
    }
}
