package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FC extends AbstractC1250bx {
    public static TimeInterpolator A0B;
    public static String[] A0C = {"K3xavpXOVVnTPS8V8FmisIpuez1NdmFn", "QjoCrUVtXYT15qNhmppxWCsnlOvXMRWn", "HVYav4KnfeU3lAWSFDiSVAYelCZD7hW1", "SKhwmHHGUoQzTLK2kw5WKB1efbL3jYLm", "aZpNXGptJoOcjVlsPlgA0RFw1bcc4fI1", "y8DDj9eTKGlZyxtiH83YwnquX80t2qUq", "Eqht3urb", "PkOCx2w9GPXTa0iGANdHxOJetOGxrMw0"};
    public ArrayList<AbstractC03524l> A0A = new ArrayList<>();
    public ArrayList<AbstractC03524l> A07 = new ArrayList<>();
    public ArrayList<AnonymousClass41> A09 = new ArrayList<>();
    public ArrayList<AnonymousClass40> A08 = new ArrayList<>();
    public ArrayList<ArrayList<AbstractC03524l>> A01 = new ArrayList<>();
    public ArrayList<ArrayList<AnonymousClass41>> A05 = new ArrayList<>();
    public ArrayList<ArrayList<AnonymousClass40>> A03 = new ArrayList<>();
    public ArrayList<AbstractC03524l> A00 = new ArrayList<>();
    public ArrayList<AbstractC03524l> A04 = new ArrayList<>();
    public ArrayList<AbstractC03524l> A06 = new ArrayList<>();
    public ArrayList<AbstractC03524l> A02 = new ArrayList<>();

    private void A01(AnonymousClass40 anonymousClass40) {
        if (anonymousClass40.A05 != null) {
            A07(anonymousClass40, anonymousClass40.A05);
        }
        if (anonymousClass40.A04 != null) {
            A07(anonymousClass40, anonymousClass40.A04);
        }
    }

    private void A03(final AbstractC03524l abstractC03524l) {
        final View view = abstractC03524l.A0H;
        final ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A06.add(abstractC03524l);
        viewPropertyAnimatorAnimate.setDuration(A07()).alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3v
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                view.setAlpha(1.0f);
                this.A02.A0P(abstractC03524l);
                this.A02.A06.remove(abstractC03524l);
                this.A02.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }

    private void A04(AbstractC03524l abstractC03524l) {
        if (A0B == null) {
            A0B = new ValueAnimator().getInterpolator();
        }
        abstractC03524l.A0H.animate().setInterpolator(A0B);
        A0K(abstractC03524l);
    }

    private final void A05(List<AbstractC03524l> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).A0H.animate().cancel();
        }
    }

    private void A06(List<AnonymousClass40> list, AbstractC03524l abstractC03524l) {
        for (int size = list.size() - 1; size >= 0; size--) {
            AnonymousClass40 anonymousClass40 = list.get(size);
            if (A07(anonymousClass40, abstractC03524l) && anonymousClass40.A05 == null && anonymousClass40.A04 == null) {
                list.remove(anonymousClass40);
            }
        }
    }

    private boolean A07(AnonymousClass40 anonymousClass40, AbstractC03524l abstractC03524l) {
        boolean z = false;
        if (anonymousClass40.A04 == abstractC03524l) {
            anonymousClass40.A04 = null;
        } else if (anonymousClass40.A05 == abstractC03524l) {
            anonymousClass40.A05 = null;
            z = true;
        } else {
            return false;
        }
        abstractC03524l.A0H.setAlpha(1.0f);
        abstractC03524l.A0H.setTranslationX(0.0f);
        abstractC03524l.A0H.setTranslationY(0.0f);
        A0Q(abstractC03524l, z);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.C4P
    public final void A0I() {
        for (int size = this.A09.size() - 1; size >= 0; size--) {
            AnonymousClass41 anonymousClass41 = this.A09.get(size);
            View view = anonymousClass41.A04.A0H;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            A0O(anonymousClass41.A04);
            this.A09.remove(size);
        }
        for (int size2 = this.A0A.size() - 1; size2 >= 0; size2--) {
            A0P(this.A0A.get(size2));
            this.A0A.remove(size2);
        }
        for (int size3 = this.A07.size() - 1; size3 >= 0; size3--) {
            AbstractC03524l abstractC03524l = this.A07.get(size3);
            abstractC03524l.A0H.setAlpha(1.0f);
            A0N(abstractC03524l);
            this.A07.remove(size3);
        }
        for (int size4 = this.A08.size() - 1; size4 >= 0; size4--) {
            A01(this.A08.get(size4));
        }
        this.A08.clear();
        if (!A0L()) {
            return;
        }
        int listCount = this.A05.size();
        for (int i = listCount - 1; i >= 0; i--) {
            ArrayList<AnonymousClass41> arrayList = this.A05.get(i);
            int listCount2 = arrayList.size();
            for (int i2 = listCount2 - 1; i2 >= 0; i2--) {
                AnonymousClass41 moveInfo = arrayList.get(i2);
                View view2 = moveInfo.A04.A0H;
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                A0O(moveInfo.A04);
                arrayList.remove(i2);
                if (arrayList.isEmpty()) {
                    this.A05.remove(arrayList);
                }
            }
        }
        for (int size5 = this.A01.size() - 1; size5 >= 0; size5--) {
            ArrayList<AbstractC03524l> arrayList2 = this.A01.get(size5);
            int i3 = arrayList2.size();
            for (int i4 = i3 - 1; i4 >= 0; i4--) {
                AbstractC03524l item = arrayList2.get(i4);
                item.A0H.setAlpha(1.0f);
                A0N(item);
                arrayList2.remove(i4);
                if (arrayList2.isEmpty()) {
                    this.A01.remove(arrayList2);
                }
            }
        }
        for (int size6 = this.A03.size() - 1; size6 >= 0; size6--) {
            ArrayList<AnonymousClass40> arrayList3 = this.A03.get(size6);
            int j = arrayList3.size();
            for (int i5 = j - 1; i5 >= 0; i5--) {
                A01(arrayList3.get(i5));
                if (arrayList3.isEmpty()) {
                    this.A03.remove(arrayList3);
                }
            }
        }
        A05(this.A06);
        A05(this.A04);
        A05(this.A00);
        A05(this.A02);
        A0A();
    }

    @Override // com.facebook.ads.redexgen.X.C4P
    public final void A0J() {
        boolean additionsPending = !this.A0A.isEmpty();
        boolean z = !this.A09.isEmpty();
        boolean movesPending = this.A08.isEmpty();
        boolean z2 = !movesPending;
        boolean changesPending = this.A07.isEmpty();
        boolean z3 = !changesPending;
        if (!additionsPending && !z && !z3 && !z2) {
            return;
        }
        Iterator<AbstractC03524l> it = this.A0A.iterator();
        while (changesPending) {
            AbstractC03524l holder = it.next();
            A03(holder);
        }
        this.A0A.clear();
        if (z) {
            final ArrayList<AnonymousClass41> arrayList = new ArrayList<>();
            arrayList.addAll(this.A09);
            this.A05.add(arrayList);
            this.A09.clear();
            Runnable runnable = new Runnable() { // from class: com.facebook.ads.redexgen.X.3s
                @Override // java.lang.Runnable
                public final void run() {
                    for (AnonymousClass41 moveInfo : arrayList) {
                        this.A00.A0Y(moveInfo.A04, moveInfo.A00, moveInfo.A01, moveInfo.A02, moveInfo.A03);
                    }
                    arrayList.clear();
                    this.A00.A05.remove(arrayList);
                }
            };
            if (additionsPending) {
                AnonymousClass38.A0E(arrayList.get(0).A04.A0H, runnable, A07());
            } else {
                runnable.run();
            }
        }
        if (z2) {
            final ArrayList<AnonymousClass40> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.A08);
            this.A03.add(arrayList2);
            this.A08.clear();
            Runnable runnable2 = new Runnable() { // from class: com.facebook.ads.redexgen.X.3t
                @Override // java.lang.Runnable
                public final void run() {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        this.A00.A0W((AnonymousClass40) it2.next());
                    }
                    arrayList2.clear();
                    this.A00.A03.remove(arrayList2);
                }
            };
            if (additionsPending) {
                AbstractC03524l holder2 = arrayList2.get(0).A05;
                AnonymousClass38.A0E(holder2.A0H, runnable2, A07());
            } else {
                runnable2.run();
            }
        }
        if (z3) {
            final ArrayList<AbstractC03524l> arrayList3 = new ArrayList<>();
            arrayList3.addAll(this.A07);
            this.A01.add(arrayList3);
            this.A07.clear();
            Runnable runnable3 = new Runnable() { // from class: com.facebook.ads.redexgen.X.3u
                @Override // java.lang.Runnable
                public final void run() {
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        this.A00.A0X((AbstractC03524l) it2.next());
                    }
                    arrayList3.clear();
                    this.A00.A01.remove(arrayList3);
                }
            };
            if (!additionsPending && !z && !z2) {
                runnable3.run();
                return;
            }
            if (A0C[0].charAt(3) == 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[4] = "oGS3g0YSOogxL8fDiPQ9wWzcLRV8E0qu";
            strArr[3] = "UwBhVdK7HoWqzQqehBBKiWd5H5AJwN9O";
            long jA07 = additionsPending ? A07() : 0L;
            long changeDuration = z ? A06() : 0L;
            long jMax = Math.max(changeDuration, z2 ? A05() : 0L) + jA07;
            View view = arrayList3.get(0).A0H;
            AnonymousClass38.A0E(view, runnable3, jMax);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4P
    public final void A0K(AbstractC03524l abstractC03524l) {
        View view = abstractC03524l.A0H;
        view.animate().cancel();
        for (int size = this.A09.size() - 1; size >= 0; size--) {
            AnonymousClass41 moveInfo = this.A09.get(size);
            if (moveInfo.A04 == abstractC03524l) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                A0O(abstractC03524l);
                this.A09.remove(size);
            }
        }
        A06(this.A08, abstractC03524l);
        if (this.A0A.remove(abstractC03524l)) {
            view.setAlpha(1.0f);
            A0P(abstractC03524l);
        }
        if (this.A07.remove(abstractC03524l)) {
            view.setAlpha(1.0f);
            A0N(abstractC03524l);
        }
        for (int size2 = this.A03.size() - 1; size2 >= 0; size2--) {
            ArrayList<AnonymousClass40> arrayList = this.A03.get(size2);
            A06(arrayList, abstractC03524l);
            if (arrayList.isEmpty()) {
                this.A03.remove(size2);
            }
        }
        for (int size3 = this.A05.size() - 1; size3 >= 0; size3--) {
            ArrayList<AnonymousClass41> arrayList2 = this.A05.get(size3);
            for (int size4 = arrayList2.size() - 1; size4 >= 0; size4--) {
                if (arrayList2.get(size4).A04 == abstractC03524l) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    String[] strArr = A0C;
                    String str = strArr[4];
                    String str2 = strArr[3];
                    int iCharAt = str.charAt(9);
                    int j = str2.charAt(9);
                    if (iCharAt == j) {
                        A0C[1] = "ZnQkkSK02m4qlFQsfXGc8k1uWyp7aRL1";
                        A0O(abstractC03524l);
                        arrayList2.remove(size4);
                        if (!arrayList2.isEmpty()) {
                            break;
                        }
                        this.A05.remove(size3);
                        break;
                    }
                    throw new RuntimeException();
                }
            }
        }
        int size5 = this.A01.size();
        if (A0C[0].charAt(3) == 'S') {
            throw new RuntimeException();
        }
        A0C[7] = "NHib0yCpDtVNZGbvtAXjIsv6RzrfBwwf";
        for (int i = size5 - 1; i >= 0; i--) {
            ArrayList<AbstractC03524l> arrayList3 = this.A01.get(i);
            if (arrayList3.remove(abstractC03524l)) {
                view.setAlpha(1.0f);
                A0N(abstractC03524l);
                if (arrayList3.isEmpty()) {
                    this.A01.remove(i);
                }
            }
        }
        this.A06.remove(abstractC03524l);
        this.A00.remove(abstractC03524l);
        this.A02.remove(abstractC03524l);
        this.A04.remove(abstractC03524l);
        A0V();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0073  */
    /* JADX WARN: Code duplicated, block: B:28:0x009c  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ba A[RETURN, SYNTHETIC] */
    @Override // com.facebook.ads.redexgen.X.C4P
    public final boolean A0L() {
        ArrayList<ArrayList<AnonymousClass40>> arrayList;
        if (this.A07.isEmpty() && this.A08.isEmpty() && this.A09.isEmpty() && this.A0A.isEmpty()) {
            boolean zIsEmpty = this.A04.isEmpty();
            String[] strArr = A0C;
            if (strArr[2].charAt(18) != strArr[5].charAt(18)) {
                String[] strArr2 = A0C;
                strArr2[4] = "HATKbuX1ioRbKjbJza4uRkbMkwnilInw";
                strArr2[3] = "55W5G9gSwoJRpeM2nuMk9rdzPBhIsXI5";
                if (zIsEmpty && this.A06.isEmpty()) {
                    boolean zIsEmpty2 = this.A00.isEmpty();
                    String[] strArr3 = A0C;
                    if (strArr3[2].charAt(18) != strArr3[5].charAt(18)) {
                        A0C[7] = "PBqWGImhwZdo7IXQpaNFK9QlBHxMp4wk";
                        if (zIsEmpty2) {
                            if (this.A02.isEmpty() && this.A05.isEmpty() && this.A01.isEmpty()) {
                                arrayList = this.A03;
                                if (A0C[7].charAt(30) != 'w') {
                                    throw new RuntimeException();
                                }
                                A0C[7] = "80rjjAfjuSoUPBYOWBOUrC4mhnJBtDwK";
                                if (!arrayList.isEmpty()) {
                                    return false;
                                }
                            }
                        }
                    } else if (zIsEmpty2) {
                        if (this.A02.isEmpty()) {
                            arrayList = this.A03;
                            if (A0C[7].charAt(30) != 'w') {
                                throw new RuntimeException();
                            }
                            A0C[7] = "80rjjAfjuSoUPBYOWBOUrC4mhnJBtDwK";
                            if (!arrayList.isEmpty()) {
                                return false;
                            }
                        }
                    }
                }
            } else {
                throw new RuntimeException();
            }
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.C4P
    public final boolean A0M(@NonNull AbstractC03524l abstractC03524l, @NonNull List<Object> list) {
        return !list.isEmpty() || super.A0M(abstractC03524l, list);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1250bx
    public final boolean A0R(AbstractC03524l abstractC03524l) {
        A04(abstractC03524l);
        abstractC03524l.A0H.setAlpha(0.0f);
        this.A07.add(abstractC03524l);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1250bx
    public final boolean A0S(AbstractC03524l abstractC03524l) {
        A04(abstractC03524l);
        this.A0A.add(abstractC03524l);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1250bx
    public final boolean A0T(AbstractC03524l abstractC03524l, int i, int i2, int i3, int i4) {
        View view = abstractC03524l.A0H;
        int deltaY = i + ((int) abstractC03524l.A0H.getTranslationX());
        int fromX = (int) abstractC03524l.A0H.getTranslationY();
        int i5 = i2 + fromX;
        A04(abstractC03524l);
        int fromY = i3 - deltaY;
        int i6 = i4 - i5;
        if (fromY == 0 && i6 == 0) {
            A0O(abstractC03524l);
            return false;
        }
        if (fromY != 0) {
            int deltaX = -fromY;
            view.setTranslationX(deltaX);
        }
        if (i6 != 0) {
            int deltaX2 = -i6;
            view.setTranslationY(deltaX2);
        }
        this.A09.add(new AnonymousClass41(abstractC03524l, deltaY, i5, i3, i4));
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1250bx
    public final boolean A0U(AbstractC03524l abstractC03524l, AbstractC03524l abstractC03524l2, int deltaX, int deltaY, int i, int i2) {
        if (abstractC03524l == abstractC03524l2) {
            return A0T(abstractC03524l, deltaX, deltaY, i, i2);
        }
        float translationX = abstractC03524l.A0H.getTranslationX();
        float translationY = abstractC03524l.A0H.getTranslationY();
        float alpha = abstractC03524l.A0H.getAlpha();
        A04(abstractC03524l);
        int i3 = (int) ((i - deltaX) - translationX);
        int i4 = (int) ((i2 - deltaY) - translationY);
        abstractC03524l.A0H.setTranslationX(translationX);
        abstractC03524l.A0H.setTranslationY(translationY);
        abstractC03524l.A0H.setAlpha(alpha);
        if (abstractC03524l2 != null) {
            A04(abstractC03524l2);
            abstractC03524l2.A0H.setTranslationX(-i3);
            abstractC03524l2.A0H.setTranslationY(-i4);
            abstractC03524l2.A0H.setAlpha(0.0f);
        }
        this.A08.add(new AnonymousClass40(abstractC03524l, abstractC03524l2, deltaX, deltaY, i, i2));
        return true;
    }

    public final void A0V() {
        if (!A0L()) {
            A0A();
        }
    }

    public final void A0W(final AnonymousClass40 anonymousClass40) {
        final View view;
        AbstractC03524l abstractC03524l = anonymousClass40.A05;
        if (abstractC03524l == null) {
            view = null;
        } else {
            view = abstractC03524l.A0H;
        }
        AbstractC03524l abstractC03524l2 = anonymousClass40.A04;
        final View view2 = abstractC03524l2 != null ? abstractC03524l2.A0H : null;
        if (view != null) {
            final ViewPropertyAnimator duration = view.animate().setDuration(A05());
            this.A02.add(anonymousClass40.A05);
            duration.translationX(anonymousClass40.A02 - anonymousClass40.A00);
            duration.translationY(anonymousClass40.A03 - anonymousClass40.A01);
            ViewPropertyAnimator oldViewAnim = duration.alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3y
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    duration.setListener(null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    this.A03.A0Q(anonymousClass40.A05, true);
                    this.A03.A02.remove(anonymousClass40.A05);
                    this.A03.A0V();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            });
            oldViewAnim.start();
        }
        if (view2 != null) {
            final ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.A02.add(anonymousClass40.A04);
            ViewPropertyAnimator newViewAnimation = viewPropertyAnimatorAnimate.translationX(0.0f);
            newViewAnimation.translationY(0.0f).setDuration(A05()).alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3z
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    viewPropertyAnimatorAnimate.setListener(null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(0.0f);
                    this.A03.A0Q(anonymousClass40.A04, false);
                    this.A03.A02.remove(anonymousClass40.A04);
                    this.A03.A0V();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            }).start();
        }
    }

    public final void A0X(final AbstractC03524l abstractC03524l) {
        final View view = abstractC03524l.A0H;
        final ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A00.add(abstractC03524l);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(A04()).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3w
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                view.setAlpha(1.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                this.A02.A0N(abstractC03524l);
                this.A02.A00.remove(abstractC03524l);
                this.A02.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }

    public final void A0Y(final AbstractC03524l abstractC03524l, int i, int i2, int i3, int deltaX) {
        final View view = abstractC03524l.A0H;
        final int i4 = i3 - i;
        final int deltaX2 = deltaX - i2;
        if (i4 != 0) {
            view.animate().translationX(0.0f);
        }
        if (deltaX2 != 0) {
            view.animate().translationY(0.0f);
        }
        final ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A04.add(abstractC03524l);
        ViewPropertyAnimator animation = viewPropertyAnimatorAnimate.setDuration(A06());
        animation.setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.3x
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                if (i4 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (deltaX2 != 0) {
                    view.setTranslationY(0.0f);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                viewPropertyAnimatorAnimate.setListener(null);
                this.A04.A0O(abstractC03524l);
                this.A04.A04.remove(abstractC03524l);
                this.A04.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }
}
