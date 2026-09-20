package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class oo3 implements jk0 {
    public static boolean g = true;
    public final RenderNode a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;

    public oo3(AndroidComposeView androidComposeView) {
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        this.a = renderNodeCreate;
        if (g) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                zo3 zo3Var = zo3.a;
                zo3Var.c(renderNodeCreate, zo3Var.a(renderNodeCreate));
                zo3Var.d(renderNodeCreate, zo3Var.b(renderNodeCreate));
            }
            if (i >= 24) {
                yo3.a.a(renderNodeCreate);
            } else {
                xo3.a.a(renderNodeCreate);
            }
            g = false;
        }
    }

    @Override // defpackage.jk0
    public final void A(int i) {
        this.c += i;
        this.e += i;
        this.a.offsetTopAndBottom(i);
    }

    @Override // defpackage.jk0
    public final boolean B() {
        return this.a.isValid();
    }

    @Override // defpackage.jk0
    public final void C(Outline outline) {
        this.a.setOutline(outline);
    }

    @Override // defpackage.jk0
    public final void D(pq2 pq2Var, qz2 qz2Var, j81<? super dn, sd5> j81Var) {
        int i = this.d - this.b;
        int i2 = this.e - this.c;
        RenderNode renderNode = this.a;
        DisplayListCanvas displayListCanvasStart = renderNode.start(i, i2);
        Canvas canvasW = pq2Var.k().w();
        pq2Var.k().x((Canvas) displayListCanvasStart);
        ZCR zcrK = pq2Var.k();
        if (qz2Var != null) {
            zcrK.e();
            zcrK.d(qz2Var, 1);
        }
        j81Var.invoke(zcrK);
        if (qz2Var != null) {
            zcrK.r();
        }
        pq2Var.k().x(canvasW);
        renderNode.end(displayListCanvasStart);
    }

    @Override // defpackage.jk0
    public final boolean E() {
        return this.a.setHasOverlappingRendering(true);
    }

    @Override // defpackage.jk0
    public final boolean F() {
        return this.f;
    }

    @Override // defpackage.jk0
    public final int G() {
        return this.c;
    }

    @Override // defpackage.jk0
    public final void H(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            zo3.a.c(this.a, i);
        }
    }

    @Override // defpackage.jk0
    public final int I() {
        return this.d;
    }

    @Override // defpackage.jk0
    public final boolean J() {
        return this.a.getClipToOutline();
    }

    @Override // defpackage.jk0
    public final void K(boolean z) {
        this.a.setClipToOutline(z);
    }

    @Override // defpackage.jk0
    public final void L(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            zo3.a.d(this.a, i);
        }
    }

    @Override // defpackage.jk0
    public final void M(Matrix matrix) {
        this.a.getMatrix(matrix);
    }

    @Override // defpackage.jk0
    public final float N() {
        return this.a.getElevation();
    }

    @Override // defpackage.jk0
    public final void b(float f) {
        this.a.setAlpha(f);
    }

    @Override // defpackage.jk0
    public final void e(float f) {
        this.a.setRotationY(f);
    }

    @Override // defpackage.jk0
    public final void f() {
    }

    @Override // defpackage.jk0
    public final void g(float f) {
        this.a.setRotation(f);
    }

    @Override // defpackage.jk0
    public final int getHeight() {
        return this.e - this.c;
    }

    @Override // defpackage.jk0
    public final int getWidth() {
        return this.d - this.b;
    }

    @Override // defpackage.jk0
    public final void h(float f) {
        this.a.setTranslationY(f);
    }

    @Override // defpackage.jk0
    public final void i(float f) {
        this.a.setScaleY(f);
    }

    @Override // defpackage.jk0
    public final void k(float f) {
        this.a.setScaleX(f);
    }

    @Override // defpackage.jk0
    public final void m(float f) {
        this.a.setTranslationX(f);
    }

    @Override // defpackage.jk0
    public final float n() {
        return this.a.getAlpha();
    }

    @Override // defpackage.jk0
    public final void o(float f) {
        this.a.setCameraDistance(-f);
    }

    @Override // defpackage.jk0
    public final void p(float f) {
        this.a.setRotationX(f);
    }

    @Override // defpackage.jk0
    public final void q(int i) {
        this.b += i;
        this.d += i;
        this.a.offsetLeftAndRight(i);
    }

    @Override // defpackage.jk0
    public final int r() {
        return this.e;
    }

    @Override // defpackage.jk0
    public final void s(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.a);
    }

    @Override // defpackage.jk0
    public final int t() {
        return this.b;
    }

    @Override // defpackage.jk0
    public final void u(float f) {
        this.a.setPivotX(f);
    }

    @Override // defpackage.jk0
    public final void v(boolean z) {
        this.f = z;
        this.a.setClipToBounds(z);
    }

    @Override // defpackage.jk0
    public final boolean w(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        return this.a.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.jk0
    public final void x() {
        int i = Build.VERSION.SDK_INT;
        RenderNode renderNode = this.a;
        if (i >= 24) {
            yo3.a.a(renderNode);
        } else {
            xo3.a.a(renderNode);
        }
    }

    @Override // defpackage.jk0
    public final void y(float f) {
        this.a.setPivotY(f);
    }

    @Override // defpackage.jk0
    public final void z(float f) {
        this.a.setElevation(f);
    }
}
