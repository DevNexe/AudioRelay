package com.github.mikephil.charting.renderer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class PieChartRenderer extends DataRenderer {
    protected Canvas mBitmapCanvas;
    private RectF mCenterTextLastBounds;
    private CharSequence mCenterTextLastValue;
    private StaticLayout mCenterTextLayout;
    private TextPaint mCenterTextPaint;
    protected PieChart mChart;
    protected WeakReference<Bitmap> mDrawBitmap;
    protected Path mDrawCenterTextPathBuffer;
    protected RectF mDrawHighlightedRectF;
    private Paint mEntryLabelsPaint;
    private Path mHoleCirclePath;
    protected Paint mHolePaint;
    private RectF mInnerRectBuffer;
    private Path mPathBuffer;
    private RectF[] mRectBuffer;
    protected Paint mTransparentCirclePaint;
    protected Paint mValueLinePaint;

    public PieChartRenderer(PieChart pieChart, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mCenterTextLastBounds = new RectF();
        this.mRectBuffer = new RectF[]{new RectF(), new RectF(), new RectF()};
        this.mPathBuffer = new Path();
        this.mInnerRectBuffer = new RectF();
        this.mHoleCirclePath = new Path();
        this.mDrawCenterTextPathBuffer = new Path();
        this.mDrawHighlightedRectF = new RectF();
        this.mChart = pieChart;
        Paint paint = new Paint(1);
        this.mHolePaint = paint;
        paint.setColor(-1);
        this.mHolePaint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.mTransparentCirclePaint = paint2;
        paint2.setColor(-1);
        this.mTransparentCirclePaint.setStyle(Paint.Style.FILL);
        this.mTransparentCirclePaint.setAlpha(105);
        TextPaint textPaint = new TextPaint(1);
        this.mCenterTextPaint = textPaint;
        textPaint.setColor(-16777216);
        this.mCenterTextPaint.setTextSize(Utils.convertDpToPixel(12.0f));
        this.mValuePaint.setTextSize(Utils.convertDpToPixel(13.0f));
        this.mValuePaint.setColor(-1);
        this.mValuePaint.setTextAlign(Paint.Align.CENTER);
        Paint paint3 = new Paint(1);
        this.mEntryLabelsPaint = paint3;
        paint3.setColor(-1);
        this.mEntryLabelsPaint.setTextAlign(Paint.Align.CENTER);
        this.mEntryLabelsPaint.setTextSize(Utils.convertDpToPixel(13.0f));
        Paint paint4 = new Paint(1);
        this.mValueLinePaint = paint4;
        paint4.setStyle(Paint.Style.STROKE);
    }

    public float calculateMinimumRadiusForSpacedSlice(MPPointF mPPointF, float f, float f2, float f3, float f4, float f5, float f6) {
        double d = (f5 + f6) * 0.017453292f;
        float fCos = (((float) Math.cos(d)) * f) + mPPointF.x;
        float fSin = (((float) Math.sin(d)) * f) + mPPointF.y;
        double d2 = ((f6 / 2.0f) + f5) * 0.017453292f;
        float fCos2 = (((float) Math.cos(d2)) * f) + mPPointF.x;
        return (float) (((double) (f - ((float) (Math.tan(((180.0d - ((double) f2)) / 2.0d) * 0.017453292519943295d) * (Math.sqrt(Math.pow(fSin - f4, 2.0d) + Math.pow(fCos - f3, 2.0d)) / 2.0d))))) - Math.sqrt(Math.pow(((((float) Math.sin(d2)) * f) + mPPointF.y) - ((fSin + f4) / 2.0f), 2.0d) + Math.pow(fCos2 - ((fCos + f3) / 2.0f), 2.0d)));
    }

    public void drawCenterText(Canvas canvas) {
        float radius;
        CharSequence centerText = this.mChart.getCenterText();
        if (!this.mChart.isDrawCenterTextEnabled() || centerText == null) {
            return;
        }
        MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        MPPointF centerTextOffset = this.mChart.getCenterTextOffset();
        float f = centerCircleBox.x + centerTextOffset.x;
        float f2 = centerCircleBox.y + centerTextOffset.y;
        if (!this.mChart.isDrawHoleEnabled() || this.mChart.isDrawSlicesUnderHoleEnabled()) {
            radius = this.mChart.getRadius();
        } else {
            radius = (this.mChart.getHoleRadius() / 100.0f) * this.mChart.getRadius();
        }
        RectF[] rectFArr = this.mRectBuffer;
        RectF rectF = rectFArr[0];
        rectF.left = f - radius;
        rectF.top = f2 - radius;
        rectF.right = f + radius;
        rectF.bottom = f2 + radius;
        RectF rectF2 = rectFArr[1];
        rectF2.set(rectF);
        float centerTextRadiusPercent = this.mChart.getCenterTextRadiusPercent() / 100.0f;
        if (centerTextRadiusPercent > 0.0d) {
            rectF2.inset((rectF2.width() - (rectF2.width() * centerTextRadiusPercent)) / 2.0f, (rectF2.height() - (rectF2.height() * centerTextRadiusPercent)) / 2.0f);
        }
        if (!centerText.equals(this.mCenterTextLastValue) || !rectF2.equals(this.mCenterTextLastBounds)) {
            this.mCenterTextLastBounds.set(rectF2);
            this.mCenterTextLastValue = centerText;
            this.mCenterTextLayout = new StaticLayout(centerText, 0, centerText.length(), this.mCenterTextPaint, (int) Math.max(Math.ceil(this.mCenterTextLastBounds.width()), 1.0d), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        }
        float height = this.mCenterTextLayout.getHeight();
        canvas.save();
        Path path = this.mDrawCenterTextPathBuffer;
        path.reset();
        path.addOval(rectF, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(rectF2.left, ((rectF2.height() - height) / 2.0f) + rectF2.top);
        this.mCenterTextLayout.draw(canvas);
        canvas.restore();
        MPPointF.recycleInstance(centerCircleBox);
        MPPointF.recycleInstance(centerTextOffset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        int chartWidth = (int) this.mViewPortHandler.getChartWidth();
        int chartHeight = (int) this.mViewPortHandler.getChartHeight();
        WeakReference<Bitmap> weakReference = this.mDrawBitmap;
        Bitmap bitmapCreateBitmap = weakReference == null ? null : weakReference.get();
        if (bitmapCreateBitmap == null || bitmapCreateBitmap.getWidth() != chartWidth || bitmapCreateBitmap.getHeight() != chartHeight) {
            if (chartWidth <= 0 || chartHeight <= 0) {
                return;
            }
            bitmapCreateBitmap = Bitmap.createBitmap(chartWidth, chartHeight, Bitmap.Config.ARGB_4444);
            this.mDrawBitmap = new WeakReference<>(bitmapCreateBitmap);
            this.mBitmapCanvas = new Canvas(bitmapCreateBitmap);
        }
        bitmapCreateBitmap.eraseColor(0);
        for (IPieDataSet iPieDataSet : ((PieData) this.mChart.getData()).getDataSets()) {
            if (iPieDataSet.isVisible() && iPieDataSet.getEntryCount() > 0) {
                drawDataSet(canvas, iPieDataSet);
            }
        }
    }

    public void drawDataSet(Canvas canvas, IPieDataSet iPieDataSet) {
        float f;
        float f2;
        float f3;
        float f4;
        boolean z;
        PieChartRenderer pieChartRenderer = this;
        IPieDataSet iPieDataSet2 = iPieDataSet;
        float rotationAngle = pieChartRenderer.mChart.getRotationAngle();
        float phaseX = pieChartRenderer.mAnimator.getPhaseX();
        float phaseY = pieChartRenderer.mAnimator.getPhaseY();
        RectF circleBox = pieChartRenderer.mChart.getCircleBox();
        int entryCount = iPieDataSet.getEntryCount();
        float[] drawAngles = pieChartRenderer.mChart.getDrawAngles();
        MPPointF centerCircleBox = pieChartRenderer.mChart.getCenterCircleBox();
        float radius = pieChartRenderer.mChart.getRadius();
        boolean z2 = pieChartRenderer.mChart.isDrawHoleEnabled() && !pieChartRenderer.mChart.isDrawSlicesUnderHoleEnabled();
        float holeRadius = z2 ? (pieChartRenderer.mChart.getHoleRadius() / 100.0f) * radius : 0.0f;
        float holeRadius2 = (radius - ((pieChartRenderer.mChart.getHoleRadius() * radius) / 100.0f)) / 2.0f;
        RectF rectF = new RectF();
        boolean z3 = z2 && pieChartRenderer.mChart.isDrawRoundedSlicesEnabled();
        int i = 0;
        for (int i2 = 0; i2 < entryCount; i2++) {
            if (Math.abs(iPieDataSet2.getEntryForIndex(i2).getY()) > Utils.FLOAT_EPSILON) {
                i++;
            }
        }
        float sliceSpace = i <= 1 ? 0.0f : pieChartRenderer.getSliceSpace(iPieDataSet2);
        int i3 = 0;
        float f5 = 0.0f;
        while (i3 < entryCount) {
            float f6 = drawAngles[i3];
            float fAbs = Math.abs(iPieDataSet2.getEntryForIndex(i3).getY());
            float f7 = Utils.FLOAT_EPSILON;
            if (fAbs > f7 && (!pieChartRenderer.mChart.needsHighlight(i3) || z3)) {
                boolean z4 = sliceSpace > 0.0f && f6 <= 180.0f;
                pieChartRenderer.mRenderPaint.setColor(iPieDataSet2.getColor(i3));
                float f8 = i == 1 ? 0.0f : sliceSpace / (radius * 0.017453292f);
                float f9 = (((f8 / 2.0f) + f5) * phaseY) + rotationAngle;
                float f10 = (f6 - f8) * phaseY;
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                }
                pieChartRenderer.mPathBuffer.reset();
                if (z3) {
                    float f11 = radius - holeRadius2;
                    double d = f9 * 0.017453292f;
                    float fCos = (((float) Math.cos(d)) * f11) + centerCircleBox.x;
                    float fSin = (f11 * ((float) Math.sin(d))) + centerCircleBox.y;
                    rectF.set(fCos - holeRadius2, fSin - holeRadius2, fCos + holeRadius2, fSin + holeRadius2);
                }
                double d2 = f9 * 0.017453292f;
                f = rotationAngle;
                f2 = phaseX;
                float fCos2 = (((float) Math.cos(d2)) * radius) + centerCircleBox.x;
                float fSin2 = (((float) Math.sin(d2)) * radius) + centerCircleBox.y;
                if (f10 < 360.0f || f10 % 360.0f > f7) {
                    if (z3) {
                        pieChartRenderer.mPathBuffer.arcTo(rectF, f9 + 180.0f, -180.0f);
                    }
                    pieChartRenderer.mPathBuffer.arcTo(circleBox, f9, f10);
                } else {
                    pieChartRenderer.mPathBuffer.addCircle(centerCircleBox.x, centerCircleBox.y, radius, Path.Direction.CW);
                }
                RectF rectF2 = pieChartRenderer.mInnerRectBuffer;
                float f12 = centerCircleBox.x;
                float f13 = centerCircleBox.y;
                float f14 = f10;
                rectF2.set(f12 - holeRadius, f13 - holeRadius, f12 + holeRadius, f13 + holeRadius);
                if (z2) {
                    if (holeRadius > 0.0f || z4) {
                        if (z4) {
                            f4 = f14;
                            holeRadius = holeRadius;
                            z = true;
                            float fCalculateMinimumRadiusForSpacedSlice = calculateMinimumRadiusForSpacedSlice(centerCircleBox, radius, f6 * phaseY, fCos2, fSin2, f9, f4);
                            if (fCalculateMinimumRadiusForSpacedSlice < 0.0f) {
                                fCalculateMinimumRadiusForSpacedSlice = -fCalculateMinimumRadiusForSpacedSlice;
                            }
                            holeRadius = Math.max(holeRadius, fCalculateMinimumRadiusForSpacedSlice);
                        } else {
                            holeRadius = holeRadius;
                            f4 = f14;
                            z = true;
                        }
                        float f15 = (i == z || holeRadius == 0.0f) ? 0.0f : sliceSpace / (holeRadius * 0.017453292f);
                        float f16 = (((f15 / 2.0f) + f5) * phaseY) + f;
                        float f17 = (f6 - f15) * phaseY;
                        if (f17 < 0.0f) {
                            f17 = 0.0f;
                        }
                        float f18 = f16 + f17;
                        if (f10 < 360.0f || f4 % 360.0f > f7) {
                            pieChartRenderer = this;
                            if (z3) {
                                float f19 = radius - holeRadius2;
                                double d3 = f18 * 0.017453292f;
                                float fCos3 = (((float) Math.cos(d3)) * f19) + centerCircleBox.x;
                                float fSin3 = (f19 * ((float) Math.sin(d3))) + centerCircleBox.y;
                                rectF = rectF;
                                rectF.set(fCos3 - holeRadius2, fSin3 - holeRadius2, fCos3 + holeRadius2, fSin3 + holeRadius2);
                                pieChartRenderer.mPathBuffer.arcTo(rectF, f18, 180.0f);
                            } else {
                                rectF = rectF;
                                double d4 = f18 * 0.017453292f;
                                pieChartRenderer.mPathBuffer.lineTo((((float) Math.cos(d4)) * holeRadius) + centerCircleBox.x, (holeRadius * ((float) Math.sin(d4))) + centerCircleBox.y);
                            }
                            pieChartRenderer.mPathBuffer.arcTo(pieChartRenderer.mInnerRectBuffer, f18, -f17);
                        } else {
                            pieChartRenderer = this;
                            pieChartRenderer.mPathBuffer.addCircle(centerCircleBox.x, centerCircleBox.y, holeRadius, Path.Direction.CCW);
                            holeRadius = holeRadius;
                            rectF = rectF;
                        }
                        centerCircleBox = centerCircleBox;
                    } else {
                        f3 = 360.0f;
                    }
                    pieChartRenderer.mPathBuffer.close();
                    pieChartRenderer.mBitmapCanvas.drawPath(pieChartRenderer.mPathBuffer, pieChartRenderer.mRenderPaint);
                    f5 = (f6 * f2) + f5;
                } else {
                    f3 = 360.0f;
                }
                if (f14 % f3 > f7) {
                    if (z4) {
                        float fCalculateMinimumRadiusForSpacedSlice2 = calculateMinimumRadiusForSpacedSlice(centerCircleBox, radius, f6 * phaseY, fCos2, fSin2, f9, f14);
                        double d5 = ((f14 / 2.0f) + f9) * 0.017453292f;
                        pieChartRenderer.mPathBuffer.lineTo((((float) Math.cos(d5)) * fCalculateMinimumRadiusForSpacedSlice2) + centerCircleBox.x, (fCalculateMinimumRadiusForSpacedSlice2 * ((float) Math.sin(d5))) + centerCircleBox.y);
                    } else {
                        pieChartRenderer.mPathBuffer.lineTo(centerCircleBox.x, centerCircleBox.y);
                    }
                }
                pieChartRenderer.mPathBuffer.close();
                pieChartRenderer.mBitmapCanvas.drawPath(pieChartRenderer.mPathBuffer, pieChartRenderer.mRenderPaint);
                f5 = (f6 * f2) + f5;
            } else {
                i3 = i3;
                holeRadius = holeRadius;
                radius = radius;
                f = rotationAngle;
                f2 = phaseX;
                circleBox = circleBox;
                entryCount = entryCount;
                drawAngles = drawAngles;
                f5 = (f6 * phaseX) + f5;
                i = i;
                rectF = rectF;
                centerCircleBox = centerCircleBox;
            }
            i3++;
            iPieDataSet2 = iPieDataSet;
            centerCircleBox = centerCircleBox;
            i = i;
            rectF = rectF;
            radius = radius;
            rotationAngle = f;
            entryCount = entryCount;
            drawAngles = drawAngles;
            phaseX = f2;
            holeRadius = holeRadius;
            circleBox = circleBox;
        }
        MPPointF.recycleInstance(centerCircleBox);
    }

    public void drawEntryLabel(Canvas canvas, String str, float f, float f2) {
        canvas.drawText(str, f, f2, this.mEntryLabelsPaint);
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
        drawHole(canvas);
        canvas.drawBitmap(this.mDrawBitmap.get(), 0.0f, 0.0f, (Paint) null);
        drawCenterText(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        float f;
        float f2;
        MPPointF mPPointF;
        IPieDataSet dataSetByIndex;
        float f3;
        int i;
        float fCalculateMinimumRadiusForSpacedSlice;
        float fMax;
        boolean z = this.mChart.isDrawHoleEnabled() && !this.mChart.isDrawSlicesUnderHoleEnabled();
        if (z && this.mChart.isDrawRoundedSlicesEnabled()) {
            return;
        }
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float rotationAngle = this.mChart.getRotationAngle();
        float[] drawAngles = this.mChart.getDrawAngles();
        float[] absoluteAngles = this.mChart.getAbsoluteAngles();
        MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        float radius = this.mChart.getRadius();
        float holeRadius = z ? (this.mChart.getHoleRadius() / 100.0f) * radius : 0.0f;
        RectF rectF = this.mDrawHighlightedRectF;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        int i2 = 0;
        while (i2 < highlightArr.length) {
            int x = (int) highlightArr[i2].getX();
            if (x < drawAngles.length && (dataSetByIndex = ((PieData) this.mChart.getData()).getDataSetByIndex(highlightArr[i2].getDataSetIndex())) != null && dataSetByIndex.isHighlightEnabled()) {
                int entryCount = dataSetByIndex.getEntryCount();
                int i3 = 0;
                for (int i4 = 0; i4 < entryCount; i4++) {
                    if (Math.abs(dataSetByIndex.getEntryForIndex(i4).getY()) > Utils.FLOAT_EPSILON) {
                        i3++;
                    }
                }
                if (x == 0) {
                    i = 1;
                    f3 = 0.0f;
                } else {
                    f3 = absoluteAngles[x - 1] * phaseX;
                    i = 1;
                }
                float sliceSpace = i3 <= i ? 0.0f : dataSetByIndex.getSliceSpace();
                float f4 = drawAngles[x];
                float selectionShift = dataSetByIndex.getSelectionShift();
                float f5 = radius + selectionShift;
                rectF.set(this.mChart.getCircleBox());
                float f6 = -selectionShift;
                rectF.inset(f6, f6);
                boolean z2 = sliceSpace > 0.0f && f4 <= 180.0f;
                this.mRenderPaint.setColor(dataSetByIndex.getColor(x));
                float f7 = i3 == 1 ? 0.0f : sliceSpace / (radius * 0.017453292f);
                float f8 = i3 == 1 ? 0.0f : sliceSpace / (f5 * 0.017453292f);
                float f9 = (((f7 / 2.0f) + f3) * phaseY) + rotationAngle;
                float f10 = (f4 - f7) * phaseY;
                float f11 = f10 < 0.0f ? 0.0f : f10;
                float f12 = (((f8 / 2.0f) + f3) * phaseY) + rotationAngle;
                float f13 = (f4 - f8) * phaseY;
                if (f13 < 0.0f) {
                    f13 = 0.0f;
                }
                this.mPathBuffer.reset();
                if (f11 < 360.0f || f11 % 360.0f > Utils.FLOAT_EPSILON) {
                    double d = f12 * 0.017453292f;
                    this.mPathBuffer.moveTo((((float) Math.cos(d)) * f5) + centerCircleBox.x, (f5 * ((float) Math.sin(d))) + centerCircleBox.y);
                    this.mPathBuffer.arcTo(rectF, f12, f13);
                } else {
                    this.mPathBuffer.addCircle(centerCircleBox.x, centerCircleBox.y, f5, Path.Direction.CW);
                }
                if (z2) {
                    double d2 = f9 * 0.017453292f;
                    mPPointF = centerCircleBox;
                    fCalculateMinimumRadiusForSpacedSlice = calculateMinimumRadiusForSpacedSlice(centerCircleBox, radius, f4 * phaseY, (((float) Math.cos(d2)) * radius) + centerCircleBox.x, (((float) Math.sin(d2)) * radius) + centerCircleBox.y, f9, f11);
                } else {
                    mPPointF = centerCircleBox;
                    fCalculateMinimumRadiusForSpacedSlice = 0.0f;
                }
                RectF rectF2 = this.mInnerRectBuffer;
                float f14 = mPPointF.x;
                float f15 = mPPointF.y;
                rectF2.set(f14 - 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01cf: INVOKE 
                      (r0v23 'rectF2' android.graphics.RectF)
                      (wrap float:0x01c7: ARITH (r1v15 'f14' float) - (r22v0 float) A[WRAPPED] (LINE:456))
                      (wrap float:0x01cb: ARITH (r3v3 'f15' float) - (r22v0 float) A[WRAPPED] (LINE:460))
                      (wrap float:0x01cd: ARITH (r1v15 'f14' float) + (r22v0 float) A[WRAPPED] (LINE:462))
                      (wrap float:0x01ce: ARITH (r3v3 'f15' float) + (r22v0 float) A[WRAPPED] (LINE:463))
                     VIRTUAL call: android.graphics.RectF.set(float, float, float, float):void A[MD:(float, float, float, float):void (c)] (LINE:464) in method: com.github.mikephil.charting.renderer.PieChartRenderer.drawHighlighted(android.graphics.Canvas, com.github.mikephil.charting.highlight.Highlight[]):void, file: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                    	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r22v0 float
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 690
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.renderer.PieChartRenderer.drawHighlighted(android.graphics.Canvas, com.github.mikephil.charting.highlight.Highlight[]):void");
            }

            public void drawHole(Canvas canvas) {
                if (!this.mChart.isDrawHoleEnabled() || this.mBitmapCanvas == null) {
                    return;
                }
                float radius = this.mChart.getRadius();
                float holeRadius = (this.mChart.getHoleRadius() / 100.0f) * radius;
                MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
                if (Color.alpha(this.mHolePaint.getColor()) > 0) {
                    this.mBitmapCanvas.drawCircle(centerCircleBox.x, centerCircleBox.y, holeRadius, this.mHolePaint);
                }
                if (Color.alpha(this.mTransparentCirclePaint.getColor()) > 0 && this.mChart.getTransparentCircleRadius() > this.mChart.getHoleRadius()) {
                    int alpha = this.mTransparentCirclePaint.getAlpha();
                    float transparentCircleRadius = (this.mChart.getTransparentCircleRadius() / 100.0f) * radius;
                    this.mTransparentCirclePaint.setAlpha((int) (this.mAnimator.getPhaseY() * this.mAnimator.getPhaseX() * alpha));
                    this.mHoleCirclePath.reset();
                    this.mHoleCirclePath.addCircle(centerCircleBox.x, centerCircleBox.y, transparentCircleRadius, Path.Direction.CW);
                    this.mHoleCirclePath.addCircle(centerCircleBox.x, centerCircleBox.y, holeRadius, Path.Direction.CCW);
                    this.mBitmapCanvas.drawPath(this.mHoleCirclePath, this.mTransparentCirclePaint);
                    this.mTransparentCirclePaint.setAlpha(alpha);
                }
                MPPointF.recycleInstance(centerCircleBox);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public void drawRoundedSlices(Canvas canvas) {
                if (this.mChart.isDrawRoundedSlicesEnabled()) {
                    IPieDataSet dataSet = ((PieData) this.mChart.getData()).getDataSet();
                    if (dataSet.isVisible()) {
                        float phaseX = this.mAnimator.getPhaseX();
                        float phaseY = this.mAnimator.getPhaseY();
                        MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
                        float radius = this.mChart.getRadius();
                        float holeRadius = (radius - ((this.mChart.getHoleRadius() * radius) / 100.0f)) / 2.0f;
                        float[] drawAngles = this.mChart.getDrawAngles();
                        float rotationAngle = this.mChart.getRotationAngle();
                        int i = 0;
                        while (i < dataSet.getEntryCount()) {
                            float f = drawAngles[i];
                            if (Math.abs(dataSet.getEntryForIndex(i).getY()) > Utils.FLOAT_EPSILON) {
                                double d = radius - holeRadius;
                                double d2 = (rotationAngle + f) * phaseY;
                                float fCos = (float) (((double) centerCircleBox.x) + (Math.cos(Math.toRadians(d2)) * d));
                                float fSin = (float) ((Math.sin(Math.toRadians(d2)) * d) + ((double) centerCircleBox.y));
                                this.mRenderPaint.setColor(dataSet.getColor(i));
                                this.mBitmapCanvas.drawCircle(fCos, fSin, holeRadius, this.mRenderPaint);
                            }
                            rotationAngle = (f * phaseX) + rotationAngle;
                            i++;
                            phaseY = phaseY;
                            drawAngles = drawAngles;
                        }
                        MPPointF.recycleInstance(centerCircleBox);
                    }
                }
            }

            @Override // com.github.mikephil.charting.renderer.DataRenderer
            public void drawValue(Canvas canvas, String str, float f, float f2, int i) {
                this.mValuePaint.setColor(i);
                canvas.drawText(str, f, f2, this.mValuePaint);
            }

            /* JADX WARN: Code duplicated, block: B:124:0x03db  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.github.mikephil.charting.renderer.DataRenderer
            public void drawValues(Canvas canvas) {
                float[] fArr;
                float[] fArr2;
                float f;
                float f2;
                float f3;
                List<IPieDataSet> list;
                MPPointF mPPointF;
                float f4;
                Canvas canvas2;
                PieDataSet.ValuePosition valuePosition;
                float f5;
                float f6;
                MPPointF mPPointF2;
                float f7;
                float f8;
                PieEntry pieEntry;
                Canvas canvas3;
                String str;
                String str2;
                Canvas canvas4;
                MPPointF mPPointF3;
                MPPointF mPPointF4;
                Canvas canvas5 = canvas;
                MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
                float radius = this.mChart.getRadius();
                float rotationAngle = this.mChart.getRotationAngle();
                float[] drawAngles = this.mChart.getDrawAngles();
                float[] absoluteAngles = this.mChart.getAbsoluteAngles();
                float phaseX = this.mAnimator.getPhaseX();
                float phaseY = this.mAnimator.getPhaseY();
                float holeRadius = (radius - ((this.mChart.getHoleRadius() * radius) / 100.0f)) / 2.0f;
                float holeRadius2 = this.mChart.getHoleRadius() / 100.0f;
                float f9 = (radius / 10.0f) * 3.6f;
                if (this.mChart.isDrawHoleEnabled()) {
                    f9 = (radius - (radius * holeRadius2)) / 2.0f;
                    if (!this.mChart.isDrawSlicesUnderHoleEnabled() && this.mChart.isDrawRoundedSlicesEnabled()) {
                        rotationAngle = (float) ((((double) (holeRadius * 360.0f)) / (((double) radius) * 6.283185307179586d)) + ((double) rotationAngle));
                    }
                }
                float f10 = rotationAngle;
                float f11 = radius - f9;
                PieData pieData = (PieData) this.mChart.getData();
                List<IPieDataSet> dataSets = pieData.getDataSets();
                float yValueSum = pieData.getYValueSum();
                boolean zIsDrawEntryLabelsEnabled = this.mChart.isDrawEntryLabelsEnabled();
                canvas.save();
                float fConvertDpToPixel = Utils.convertDpToPixel(5.0f);
                int i = 0;
                int i2 = 0;
                while (i2 < dataSets.size()) {
                    IPieDataSet iPieDataSet = dataSets.get(i2);
                    boolean zIsDrawValuesEnabled = iPieDataSet.isDrawValuesEnabled();
                    if (zIsDrawValuesEnabled || zIsDrawEntryLabelsEnabled) {
                        PieDataSet.ValuePosition xValuePosition = iPieDataSet.getXValuePosition();
                        PieDataSet.ValuePosition yValuePosition = iPieDataSet.getYValuePosition();
                        applyValueTextStyle(iPieDataSet);
                        int i3 = i;
                        float fConvertDpToPixel2 = Utils.convertDpToPixel(4.0f) + Utils.calcTextHeight(this.mValuePaint, "Q");
                        ValueFormatter valueFormatter = iPieDataSet.getValueFormatter();
                        int entryCount = iPieDataSet.getEntryCount();
                        List<IPieDataSet> list2 = dataSets;
                        this.mValueLinePaint.setColor(iPieDataSet.getValueLineColor());
                        this.mValueLinePaint.setStrokeWidth(Utils.convertDpToPixel(iPieDataSet.getValueLineWidth()));
                        float sliceSpace = getSliceSpace(iPieDataSet);
                        MPPointF mPPointF5 = MPPointF.getInstance(iPieDataSet.getIconsOffset());
                        MPPointF mPPointF6 = centerCircleBox;
                        mPPointF5.x = Utils.convertDpToPixel(mPPointF5.x);
                        mPPointF5.y = Utils.convertDpToPixel(mPPointF5.y);
                        int i4 = 0;
                        while (i4 < entryCount) {
                            MPPointF mPPointF7 = mPPointF5;
                            PieEntry entryForIndex = iPieDataSet.getEntryForIndex(i4);
                            int i5 = entryCount;
                            float f12 = ((((drawAngles[i3] - ((sliceSpace / (f11 * 0.017453292f)) / 2.0f)) / 2.0f) + (i3 == 0 ? 0.0f : absoluteAngles[i3 - 1] * phaseX)) * phaseY) + f10;
                            float f13 = sliceSpace;
                            String pieLabel = valueFormatter.getPieLabel(this.mChart.isUsePercentValuesEnabled() ? (entryForIndex.getY() / yValueSum) * 100.0f : entryForIndex.getY(), entryForIndex);
                            float[] fArr3 = drawAngles;
                            String label = entryForIndex.getLabel();
                            ValueFormatter valueFormatter2 = valueFormatter;
                            double d = f12 * 0.017453292f;
                            float[] fArr4 = absoluteAngles;
                            float f14 = phaseX;
                            float fCos = (float) Math.cos(d);
                            float f15 = phaseY;
                            float fSin = (float) Math.sin(d);
                            boolean z = zIsDrawEntryLabelsEnabled && xValuePosition == PieDataSet.ValuePosition.OUTSIDE_SLICE;
                            float f16 = f10;
                            boolean z2 = zIsDrawValuesEnabled && yValuePosition == PieDataSet.ValuePosition.OUTSIDE_SLICE;
                            boolean z3 = zIsDrawEntryLabelsEnabled && xValuePosition == PieDataSet.ValuePosition.INSIDE_SLICE;
                            PieDataSet.ValuePosition valuePosition2 = xValuePosition;
                            boolean z4 = zIsDrawValuesEnabled && yValuePosition == PieDataSet.ValuePosition.INSIDE_SLICE;
                            if (z || z2) {
                                float valueLinePart1Length = iPieDataSet.getValueLinePart1Length();
                                float valueLinePart2Length = iPieDataSet.getValueLinePart2Length();
                                float valueLinePart1OffsetPercentage = iPieDataSet.getValueLinePart1OffsetPercentage() / 100.0f;
                                valuePosition = yValuePosition;
                                if (this.mChart.isDrawHoleEnabled()) {
                                    float f17 = radius * holeRadius2;
                                    f5 = ((radius - f17) * valueLinePart1OffsetPercentage) + f17;
                                } else {
                                    f5 = radius * valueLinePart1OffsetPercentage;
                                }
                                float fAbs = iPieDataSet.isValueLineVariableLength() ? valueLinePart2Length * f11 * ((float) Math.abs(Math.sin(d))) : valueLinePart2Length * f11;
                                MPPointF mPPointF8 = mPPointF6;
                                float f18 = mPPointF8.x;
                                float f19 = (f5 * fCos) + f18;
                                f6 = radius;
                                float f20 = mPPointF8.y;
                                float f21 = (f5 * fSin) + f20;
                                float f22 = (valueLinePart1Length + 1.0f) * f11;
                                float f23 = (f22 * fCos) + f18;
                                float f24 = f20 + (f22 * fSin);
                                mPPointF2 = mPPointF8;
                                double d2 = ((double) f12) % 360.0d;
                                if (d2 < 90.0d || d2 > 270.0d) {
                                    f7 = f23 + fAbs;
                                    this.mValuePaint.setTextAlign(Paint.Align.LEFT);
                                    if (z) {
                                        this.mEntryLabelsPaint.setTextAlign(Paint.Align.LEFT);
                                    }
                                    f8 = f7 + fConvertDpToPixel;
                                } else {
                                    float f25 = f23 - fAbs;
                                    this.mValuePaint.setTextAlign(Paint.Align.RIGHT);
                                    if (z) {
                                        this.mEntryLabelsPaint.setTextAlign(Paint.Align.RIGHT);
                                    }
                                    f7 = f25;
                                    f8 = f25 - fConvertDpToPixel;
                                }
                                if (iPieDataSet.getValueLineColor() != 1122867) {
                                    if (iPieDataSet.isUsingSliceColorAsValueLineColor()) {
                                        this.mValueLinePaint.setColor(iPieDataSet.getColor(i4));
                                    }
                                    pieEntry = entryForIndex;
                                    canvas.drawLine(f19, f21, f23, f24, this.mValueLinePaint);
                                    canvas.drawLine(f23, f24, f7, f24, this.mValueLinePaint);
                                } else {
                                    pieEntry = entryForIndex;
                                }
                                if (z && z2) {
                                    drawValue(canvas, pieLabel, f8, f24, iPieDataSet.getValueTextColor(i4));
                                    if (i4 >= pieData.getEntryCount() || label == null) {
                                        canvas4 = canvas;
                                        str2 = label;
                                    } else {
                                        canvas3 = canvas;
                                        str = label;
                                        drawEntryLabel(canvas3, str, f8, f24 + fConvertDpToPixel2);
                                        str2 = str;
                                        canvas4 = canvas3;
                                    }
                                } else {
                                    canvas3 = canvas;
                                    float f26 = f8;
                                    str = label;
                                    if (z) {
                                        if (i4 < pieData.getEntryCount() && str != null) {
                                            drawEntryLabel(canvas3, str, f26, (fConvertDpToPixel2 / 2.0f) + f24);
                                        }
                                    } else if (z2) {
                                        str2 = str;
                                        canvas4 = canvas3;
                                        drawValue(canvas, pieLabel, f26, f24 + (fConvertDpToPixel2 / 2.0f), iPieDataSet.getValueTextColor(i4));
                                    }
                                    str2 = str;
                                    canvas4 = canvas3;
                                }
                            } else {
                                valuePosition = yValuePosition;
                                fSin = fSin;
                                mPPointF2 = mPPointF6;
                                mPPointF7 = mPPointF7;
                                valueFormatter2 = valueFormatter2;
                                str2 = label;
                                iPieDataSet = iPieDataSet;
                                f6 = radius;
                                canvas4 = canvas;
                                list2 = list2;
                                pieEntry = entryForIndex;
                            }
                            if (z3 || z4) {
                                mPPointF3 = mPPointF2;
                                float f27 = (f11 * fCos) + mPPointF3.x;
                                float f28 = (f11 * fSin) + mPPointF3.y;
                                this.mValuePaint.setTextAlign(Paint.Align.CENTER);
                                if (z3 && z4) {
                                    drawValue(canvas, pieLabel, f27, f28, iPieDataSet.getValueTextColor(i4));
                                    if (i4 < pieData.getEntryCount() && str2 != null) {
                                        drawEntryLabel(canvas4, str2, f27, f28 + fConvertDpToPixel2);
                                    }
                                } else {
                                    if (z3) {
                                        if (i4 < pieData.getEntryCount() && str2 != null) {
                                            drawEntryLabel(canvas4, str2, f27, (fConvertDpToPixel2 / 2.0f) + f28);
                                        }
                                    } else if (z4) {
                                        drawValue(canvas, pieLabel, f27, (fConvertDpToPixel2 / 2.0f) + f28, iPieDataSet.getValueTextColor(i4));
                                    }
                                    if (pieEntry.getIcon() == null && iPieDataSet.isDrawIconsEnabled()) {
                                        Drawable icon = pieEntry.getIcon();
                                        mPPointF4 = mPPointF7;
                                        float f29 = mPPointF4.y;
                                        Utils.drawImage(canvas, icon, (int) (((f11 + f29) * fCos) + mPPointF3.x), (int) (((f29 + f11) * fSin) + mPPointF3.y + mPPointF4.x), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                                    } else {
                                        mPPointF4 = mPPointF7;
                                    }
                                    i3++;
                                    i4++;
                                    mPPointF5 = mPPointF4;
                                    iPieDataSet = iPieDataSet;
                                    radius = f6;
                                    entryCount = i5;
                                    sliceSpace = f13;
                                    list2 = list2;
                                    drawAngles = fArr3;
                                    absoluteAngles = fArr4;
                                    phaseX = f14;
                                    f10 = f16;
                                    xValuePosition = valuePosition2;
                                    yValuePosition = valuePosition;
                                    valueFormatter = valueFormatter2;
                                    mPPointF6 = mPPointF3;
                                    phaseY = f15;
                                }
                            } else {
                                mPPointF3 = mPPointF2;
                            }
                            if (pieEntry.getIcon() == null) {
                                mPPointF4 = mPPointF7;
                            } else {
                                mPPointF4 = mPPointF7;
                            }
                            i3++;
                            i4++;
                            mPPointF5 = mPPointF4;
                            iPieDataSet = iPieDataSet;
                            radius = f6;
                            entryCount = i5;
                            sliceSpace = f13;
                            list2 = list2;
                            drawAngles = fArr3;
                            absoluteAngles = fArr4;
                            phaseX = f14;
                            f10 = f16;
                            xValuePosition = valuePosition2;
                            yValuePosition = valuePosition;
                            valueFormatter = valueFormatter2;
                            mPPointF6 = mPPointF3;
                            phaseY = f15;
                        }
                        fArr = drawAngles;
                        fArr2 = absoluteAngles;
                        f = phaseX;
                        f2 = phaseY;
                        f3 = f10;
                        list = list2;
                        mPPointF = mPPointF6;
                        f4 = radius;
                        canvas2 = canvas;
                        MPPointF.recycleInstance(mPPointF5);
                        i = i3;
                    } else {
                        list = dataSets;
                        f4 = radius;
                        fArr = drawAngles;
                        fArr2 = absoluteAngles;
                        f = phaseX;
                        f2 = phaseY;
                        f3 = f10;
                        canvas2 = canvas5;
                        mPPointF = centerCircleBox;
                    }
                    i2++;
                    canvas5 = canvas2;
                    centerCircleBox = mPPointF;
                    radius = f4;
                    dataSets = list;
                    drawAngles = fArr;
                    absoluteAngles = fArr2;
                    phaseX = f;
                    phaseY = f2;
                    f10 = f3;
                }
                MPPointF.recycleInstance(centerCircleBox);
                canvas.restore();
            }

            public TextPaint getPaintCenterText() {
                return this.mCenterTextPaint;
            }

            public Paint getPaintEntryLabels() {
                return this.mEntryLabelsPaint;
            }

            public Paint getPaintHole() {
                return this.mHolePaint;
            }

            public Paint getPaintTransparentCircle() {
                return this.mTransparentCirclePaint;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public float getSliceSpace(IPieDataSet iPieDataSet) {
                if (!iPieDataSet.isAutomaticallyDisableSliceSpacingEnabled()) {
                    return iPieDataSet.getSliceSpace();
                }
                if (iPieDataSet.getSliceSpace() / this.mViewPortHandler.getSmallestContentExtension() > (iPieDataSet.getYMin() / ((PieData) this.mChart.getData()).getYValueSum()) * 2.0f) {
                    return 0.0f;
                }
                return iPieDataSet.getSliceSpace();
            }

            @Override // com.github.mikephil.charting.renderer.DataRenderer
            public void initBuffers() {
            }

            public void releaseBitmap() {
                Canvas canvas = this.mBitmapCanvas;
                if (canvas != null) {
                    canvas.setBitmap(null);
                    this.mBitmapCanvas = null;
                }
                WeakReference<Bitmap> weakReference = this.mDrawBitmap;
                if (weakReference != null) {
                    Bitmap bitmap = weakReference.get();
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    this.mDrawBitmap.clear();
                    this.mDrawBitmap = null;
                }
            }
        }
