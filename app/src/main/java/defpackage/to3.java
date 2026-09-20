package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class to3 implements jk0 {
    public final RenderNode a = new RenderNode("Compose");

    @Override // defpackage.jk0
    public final void A(int i) {
        this.a.offsetTopAndBottom(i);
    }

    @Override // defpackage.jk0
    public final boolean B() {
        return this.a.hasDisplayList();
    }

    @Override // defpackage.jk0
    public final void C(Outline outline) {
        this.a.setOutline(outline);
    }

    @Override // defpackage.jk0
    public final void D(pq2 pq2Var, qz2 qz2Var, j81<? super dn, sd5> j81Var) {
        RenderNode renderNode = this.a;
        RecordingCanvas recordingCanvasBeginRecording = renderNode.beginRecording();
        ZCR zcr = (ZCR) pq2Var.w;
        Canvas canvas = zcr.a;
        zcr.a = recordingCanvasBeginRecording;
        if (qz2Var != null) {
            zcr.e();
            zcr.d(qz2Var, 1);
        }
        j81Var.invoke(zcr);
        if (qz2Var != null) {
            zcr.r();
        }
        ((ZCR) pq2Var.w).a = canvas;
        renderNode.endRecording();
    }

    @Override // defpackage.jk0
    public final boolean E() {
        return this.a.setHasOverlappingRendering(true);
    }

    @Override // defpackage.jk0
    public final boolean F() {
        return this.a.getClipToBounds();
    }

    @Override // defpackage.jk0
    public final int G() {
        return this.a.getTop();
    }

    @Override // defpackage.jk0
    public final void H(int i) {
        this.a.setAmbientShadowColor(i);
    }

    @Override // defpackage.jk0
    public final int I() {
        return this.a.getRight();
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
        this.a.setSpotShadowColor(i);
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
        if (Build.VERSION.SDK_INT >= 31) {
            vo3.a.a(this.a, null);
        }
    }

    @Override // defpackage.jk0
    public final void g(float f) {
        this.a.setRotationZ(f);
    }

    @Override // defpackage.jk0
    public final int getHeight() {
        return this.a.getHeight();
    }

    @Override // defpackage.jk0
    public final int getWidth() {
        return this.a.getWidth();
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
        this.a.setCameraDistance(f);
    }

    @Override // defpackage.jk0
    public final void p(float f) {
        this.a.setRotationX(f);
    }

    @Override // defpackage.jk0
    public final void q(int i) {
        this.a.offsetLeftAndRight(i);
    }

    @Override // defpackage.jk0
    public final int r() {
        return this.a.getBottom();
    }

    @Override // defpackage.jk0
    public final void s(Canvas canvas) {
        canvas.drawRenderNode(this.a);
    }

    @Override // defpackage.jk0
    public final int t() {
        return this.a.getLeft();
    }

    @Override // defpackage.jk0
    public final void u(float f) {
        this.a.setPivotX(f);
    }

    @Override // defpackage.jk0
    public final void v(boolean z) {
        this.a.setClipToBounds(z);
    }

    @Override // defpackage.jk0
    public final boolean w(int i, int i2, int i3, int i4) {
        return this.a.setPosition(i, i2, i3, i4);
    }

    @Override // defpackage.jk0
    public final void x() {
        this.a.discardDisplayList();
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
