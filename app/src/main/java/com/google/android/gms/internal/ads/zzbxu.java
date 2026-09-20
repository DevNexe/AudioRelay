package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import defpackage.Q6g;
import defpackage.t66;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbxu extends zzbya {
    public static final Set u;
    public String c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final Object k;
    public final zzcmn l;
    public final Activity m;
    public zzcoc n;
    public ImageView o;
    public LinearLayout p;
    public final zzbyb q;
    public PopupWindow r;
    public RelativeLayout s;
    public ViewGroup t;

    static {
        Q6g q6g = new Q6g(7);
        Collections.addAll(q6g, "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
        u = Collections.unmodifiableSet(q6g);
    }

    public zzbxu(zzcmn zzcmnVar, zzbyb zzbybVar) {
        super(zzcmnVar, "resize");
        this.c = "top-right";
        this.d = true;
        this.e = 0;
        this.f = 0;
        this.g = -1;
        this.h = 0;
        this.i = 0;
        this.j = -1;
        this.k = new Object();
        this.l = zzcmnVar;
        this.m = zzcmnVar.zzk();
        this.q = zzbybVar;
    }

    public final void zza(boolean z) {
        synchronized (this.k) {
            PopupWindow popupWindow = this.r;
            if (popupWindow != null) {
                popupWindow.dismiss();
                this.s.removeView((View) this.l);
                ViewGroup viewGroup = this.t;
                if (viewGroup != null) {
                    viewGroup.removeView(this.o);
                    this.t.addView((View) this.l);
                    this.l.zzai(this.n);
                }
                if (z) {
                    zzk("default");
                    zzbyb zzbybVar = this.q;
                    if (zzbybVar != null) {
                        zzbybVar.mo44zzb();
                    }
                }
                this.r = null;
                this.s = null;
                this.t = null;
                this.p = null;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:159:0x0382  */
    /* JADX WARN: Code duplicated, block: B:82:0x0183  */
    public final void zzb(Map map) {
        byte b;
        int i;
        byte b2;
        int i2;
        int i3;
        int i4;
        int i5;
        synchronized (this.k) {
            if (this.m == null) {
                zzg("Not an activity context. Cannot resize.");
                return;
            }
            if (this.l.zzQ() == null) {
                zzg("Webview is not yet available, size is not set.");
                return;
            }
            if (this.l.zzQ().zzi()) {
                zzg("Is interstitial. Cannot resize an interstitial.");
                return;
            }
            if (this.l.zzaC()) {
                zzg("Cannot resize an expanded banner.");
                return;
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                com.google.android.gms.ads.internal.zzt.zzq();
                this.j = com.google.android.gms.ads.internal.util.zzs.zzK((String) map.get("width"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                com.google.android.gms.ads.internal.zzt.zzq();
                this.g = com.google.android.gms.ads.internal.util.zzs.zzK((String) map.get("height"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                com.google.android.gms.ads.internal.zzt.zzq();
                this.h = com.google.android.gms.ads.internal.util.zzs.zzK((String) map.get("offsetX"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                com.google.android.gms.ads.internal.zzt.zzq();
                this.i = com.google.android.gms.ads.internal.util.zzs.zzK((String) map.get("offsetY"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                this.d = Boolean.parseBoolean((String) map.get("allowOffscreen"));
            }
            String str = (String) map.get("customClosePosition");
            if (!TextUtils.isEmpty(str)) {
                this.c = str;
            }
            if (this.j < 0 || this.g < 0) {
                zzg("Invalid width and height options. Cannot resize.");
                return;
            }
            Window window = this.m.getWindow();
            if (window != null && window.getDecorView() != null) {
                com.google.android.gms.ads.internal.zzt.zzq();
                int[] iArrZzR = com.google.android.gms.ads.internal.util.zzs.zzR(this.m);
                com.google.android.gms.ads.internal.zzt.zzq();
                int[] iArrZzO = com.google.android.gms.ads.internal.util.zzs.zzO(this.m);
                int i6 = iArrZzR[0];
                int i7 = iArrZzR[1];
                int i8 = this.j;
                int[] iArr = null;
                if (i8 < 50 || i8 > i6) {
                    zzcgn.zzj("Width is too small or too large.");
                } else {
                    int i9 = this.g;
                    if (i9 < 50 || i9 > i7) {
                        zzcgn.zzj("Height is too small or too large.");
                    } else if (i9 == i7 && i8 == i6) {
                        zzcgn.zzj("Cannot resize to a full-screen ad.");
                    } else if (this.d) {
                        switch (this.c) {
                            case "center":
                                b2 = 2;
                                break;
                            case "top-left":
                                b2 = 0;
                                break;
                            case "bottom-left":
                                b2 = 3;
                                break;
                            case "bottom-right":
                                b2 = 5;
                                break;
                            case "bottom-center":
                                b2 = 4;
                                break;
                            case "top-center":
                                b2 = 1;
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                        if (b2 == 0) {
                            i2 = this.e + this.h;
                            i3 = this.f;
                        } else if (b2 != 1) {
                            if (b2 != 2) {
                                if (b2 == 3) {
                                    i2 = this.e + this.h;
                                    i5 = this.f;
                                } else if (b2 == 4) {
                                    i2 = ((this.e + this.h) + (i8 >> 1)) - 25;
                                    i5 = this.f;
                                } else if (b2 != 5) {
                                    i2 = ((this.e + this.h) + i8) - 50;
                                    i3 = this.f;
                                } else {
                                    i2 = ((this.e + this.h) + i8) - 50;
                                    i5 = this.f;
                                }
                                i4 = ((i5 + this.i) + i9) - 50;
                            } else {
                                i2 = ((this.e + this.h) + (i8 >> 1)) - 25;
                                i4 = ((this.f + this.i) + (i9 >> 1)) - 25;
                            }
                            if (i2 >= 0 && i2 + 50 <= i6 && i4 >= iArrZzO[0] && i4 + 50 <= iArrZzO[1]) {
                                iArr = new int[]{this.e + this.h, this.f + this.i};
                            }
                        } else {
                            i2 = ((this.e + this.h) + (i8 >> 1)) - 25;
                            i3 = this.f;
                        }
                        i4 = i3 + this.i;
                        if (i2 >= 0) {
                            iArr = new int[]{this.e + this.h, this.f + this.i};
                        }
                    } else {
                        com.google.android.gms.ads.internal.zzt.zzq();
                        int[] iArrZzR2 = com.google.android.gms.ads.internal.util.zzs.zzR(this.m);
                        com.google.android.gms.ads.internal.zzt.zzq();
                        int[] iArrZzO2 = com.google.android.gms.ads.internal.util.zzs.zzO(this.m);
                        int i10 = iArrZzR2[0];
                        int i11 = this.e + this.h;
                        int i12 = this.f + this.i;
                        if (i11 < 0) {
                            i = 0;
                        } else {
                            int i13 = this.j;
                            i = i11 + i13 > i10 ? i10 - i13 : i11;
                        }
                        int i14 = iArrZzO2[0];
                        if (i12 < i14) {
                            i12 = i14;
                        } else {
                            int i15 = this.g;
                            int i16 = i12 + i15;
                            int i17 = iArrZzO2[1];
                            if (i16 > i17) {
                                i12 = i17 - i15;
                            }
                        }
                        iArr = new int[]{i, i12};
                    }
                }
                if (iArr == null) {
                    zzg("Resize location out of screen or close button is not visible.");
                    return;
                }
                com.google.android.gms.ads.internal.client.zzaw.zzb();
                int iZzw = zzcgg.zzw(this.m, this.j);
                com.google.android.gms.ads.internal.client.zzaw.zzb();
                int iZzw2 = zzcgg.zzw(this.m, this.g);
                ViewParent parent = ((View) this.l).getParent();
                if (parent == null || !(parent instanceof ViewGroup)) {
                    zzg("Webview is detached, probably in the middle of a resize or expand.");
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                viewGroup.removeView((View) this.l);
                PopupWindow popupWindow = this.r;
                if (popupWindow == null) {
                    this.t = viewGroup;
                    com.google.android.gms.ads.internal.zzt.zzq();
                    Object obj = this.l;
                    ((View) obj).setDrawingCacheEnabled(true);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((View) obj).getDrawingCache());
                    ((View) obj).setDrawingCacheEnabled(false);
                    ImageView imageView = new ImageView(this.m);
                    this.o = imageView;
                    imageView.setImageBitmap(bitmapCreateBitmap);
                    this.n = this.l.zzQ();
                    this.t.addView(this.o);
                } else {
                    popupWindow.dismiss();
                }
                RelativeLayout relativeLayout = new RelativeLayout(this.m);
                this.s = relativeLayout;
                relativeLayout.setBackgroundColor(0);
                this.s.setLayoutParams(new ViewGroup.LayoutParams(iZzw, iZzw2));
                com.google.android.gms.ads.internal.zzt.zzq();
                PopupWindow popupWindow2 = new PopupWindow((View) this.s, iZzw, iZzw2, false);
                this.r = popupWindow2;
                popupWindow2.setOutsideTouchable(false);
                this.r.setTouchable(true);
                this.r.setClippingEnabled(!this.d);
                this.s.addView((View) this.l, -1, -1);
                this.p = new LinearLayout(this.m);
                com.google.android.gms.ads.internal.client.zzaw.zzb();
                int iZzw3 = zzcgg.zzw(this.m, 50);
                com.google.android.gms.ads.internal.client.zzaw.zzb();
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iZzw3, zzcgg.zzw(this.m, 50));
                switch (this.c) {
                    case "center":
                        b = 2;
                        break;
                    case "top-left":
                        b = 0;
                        break;
                    case "bottom-left":
                        b = 3;
                        break;
                    case "bottom-right":
                        b = 5;
                        break;
                    case "bottom-center":
                        b = 4;
                        break;
                    case "top-center":
                        b = 1;
                        break;
                    default:
                        b = -1;
                        break;
                }
                if (b == 0) {
                    layoutParams.addRule(10);
                    layoutParams.addRule(9);
                } else if (b == 1) {
                    layoutParams.addRule(10);
                    layoutParams.addRule(14);
                } else if (b == 2) {
                    layoutParams.addRule(13);
                } else if (b == 3) {
                    layoutParams.addRule(12);
                    layoutParams.addRule(9);
                } else if (b == 4) {
                    layoutParams.addRule(12);
                    layoutParams.addRule(14);
                } else if (b != 5) {
                    layoutParams.addRule(10);
                    layoutParams.addRule(11);
                } else {
                    layoutParams.addRule(12);
                    layoutParams.addRule(11);
                }
                this.p.setOnClickListener(new t66(this));
                this.p.setContentDescription("Close button");
                this.s.addView(this.p, layoutParams);
                try {
                    PopupWindow popupWindow3 = this.r;
                    View decorView = window.getDecorView();
                    com.google.android.gms.ads.internal.client.zzaw.zzb();
                    int iZzw4 = zzcgg.zzw(this.m, iArr[0]);
                    com.google.android.gms.ads.internal.client.zzaw.zzb();
                    popupWindow3.showAtLocation(decorView, 0, iZzw4, zzcgg.zzw(this.m, iArr[1]));
                    int i18 = iArr[0];
                    int i19 = iArr[1];
                    zzbyb zzbybVar = this.q;
                    if (zzbybVar != null) {
                        zzbybVar.zza(i18, i19, this.j, this.g);
                    }
                    this.l.zzai(zzcoc.zzb(iZzw, iZzw2));
                    int i20 = iArr[0];
                    int i21 = iArr[1];
                    com.google.android.gms.ads.internal.zzt.zzq();
                    zzj(i20, i21 - com.google.android.gms.ads.internal.util.zzs.zzO(this.m)[0], this.j, this.g);
                    zzk("resized");
                    return;
                } catch (RuntimeException e) {
                    zzg("Cannot show popup window: " + e.getMessage());
                    this.s.removeView((View) this.l);
                    ViewGroup viewGroup2 = this.t;
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(this.o);
                        this.t.addView((View) this.l);
                        this.l.zzai(this.n);
                    }
                    return;
                }
            }
            zzg("Activity context is not ready, cannot get window or decor view.");
        }
    }

    public final void zzc(int i, int i2, boolean z) {
        synchronized (this.k) {
            this.e = i;
            this.f = i2;
        }
    }

    public final void zzd(int i, int i2) {
        this.e = i;
        this.f = i2;
    }

    public final boolean zze() {
        boolean z;
        synchronized (this.k) {
            z = this.r != null;
        }
        return z;
    }
}
