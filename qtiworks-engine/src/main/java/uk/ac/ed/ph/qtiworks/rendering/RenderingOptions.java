/* Copyright (c) 2012-2013, University of Edinburgh.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice, this
 *   list of conditions and the following disclaimer in the documentation and/or
 *   other materials provided with the distribution.
 *
 * * Neither the name of the University of Edinburgh nor the names of its
 *   contributors may be used to endorse or promote products derived from this
 *   software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *
 * This software is derived from (and contains code from) QTItools and MathAssessEngine.
 * QTItools is (c) 2008, University of Southampton.
 * MathAssessEngine is (c) 2010, University of Edinburgh.
 */
package uk.ac.ed.ph.qtiworks.rendering;

import uk.ac.ed.ph.jqtiplus.internal.util.ObjectUtilities;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

/**
 * Encapsulates general options for passing to the {@link AssessmentRenderer}.
 *
 * @author David McKain
 */
public final class RenderingOptions implements Serializable {

    private static final long serialVersionUID = -1744991243897646596L;

    /** Required {@link SerializationMethod} */
    @NotNull
    private SerializationMethod serializationMethod;

    @NotNull
    private String contextPath;

    @NotNull
    private String attemptUrl;

    @NotNull
    private String closeUrl;

    @NotNull
    private String resetUrl;

    @NotNull
    private String reinitUrl;

    @NotNull
    private String solutionUrl;

    @NotNull
    private String resultUrl;

    @NotNull
    private String sourceUrl;

    @NotNull
    private String playbackUrlBase;

    @NotNull
    private String terminateUrl;

    @NotNull
    private String serveFileUrl;

    @NotNull
    private String selectItemUrl;

    @NotNull
    private String finishItemUrl;

    @NotNull
    private String reviewItemUrl;

    @NotNull
    private String endTestPartUrl;

    @NotNull
    private String exitTestPartUrl;

    @NotNull
    private String testPartNavigationUrl;

    //----------------------------------------------------

    public SerializationMethod getSerializationMethod() {
        return serializationMethod;
    }

    public void setSerializationMethod(final SerializationMethod serializationMethod) {
        this.serializationMethod = serializationMethod;
    }


    public String getContextPath() {
        return contextPath;
    }

    public void setContextPath(final String contextPath) {
        this.contextPath = contextPath;
    }


    public String getAttemptUrl() {
        return attemptUrl;
    }

    public void setAttemptUrl(final String attemptUrl) {
        this.attemptUrl = attemptUrl;
    }


    public String getCloseUrl() {
        return closeUrl;
    }

    public void setCloseUrl(final String closeUrl) {
        this.closeUrl = closeUrl;
    }


    public String getResetUrl() {
        return resetUrl;
    }

    public void setResetUrl(final String resetUrl) {
        this.resetUrl = resetUrl;
    }


    public String getReinitUrl() {
        return reinitUrl;
    }

    public void setReinitUrl(final String reinitUrl) {
        this.reinitUrl = reinitUrl;
    }


    public String getSolutionUrl() {
        return solutionUrl;
    }

    public void setSolutionUrl(final String solutionUrl) {
        this.solutionUrl = solutionUrl;
    }


    public String getResultUrl() {
        return resultUrl;
    }

    public void setResultUrl(final String resultUrl) {
        this.resultUrl = resultUrl;
    }


    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(final String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }


    public String getPlaybackUrlBase() {
        return playbackUrlBase;
    }

    public void setPlaybackUrlBase(final String playbackUrlBase) {
        this.playbackUrlBase = playbackUrlBase;
    }


    public String getTerminateUrl() {
        return terminateUrl;
    }

    public void setTerminateUrl(final String terminateUrl) {
        this.terminateUrl = terminateUrl;
    }


    public String getServeFileUrl() {
        return serveFileUrl;
    }

    public void setServeFileUrl(final String serveFileUrl) {
        this.serveFileUrl = serveFileUrl;
    }


    public String getSelectItemUrl() {
        return selectItemUrl;
    }

    public void setSelectItemUrl(final String selectItemUrl) {
        this.selectItemUrl = selectItemUrl;
    }


    public String getFinishItemUrl() {
        return finishItemUrl;
    }

    public void setFinishItemUrl(final String finishItemUrl) {
        this.finishItemUrl = finishItemUrl;
    }


    public String getReviewItemUrl() {
        return reviewItemUrl;
    }

    public void setReviewItemUrl(final String reviewItemUrl) {
        this.reviewItemUrl = reviewItemUrl;
    }


    public String getEndTestPartUrl() {
        return endTestPartUrl;
    }

    public void setEndTestPartUrl(final String endTestPartUrl) {
        this.endTestPartUrl = endTestPartUrl;
    }


    public String getExitTestPartUrl() {
        return exitTestPartUrl;
    }

    public void setExitTestPartUrl(final String exitTestPartUrl) {
        this.exitTestPartUrl = exitTestPartUrl;
    }


    public String getTestPartNavigationUrl() {
        return testPartNavigationUrl;
    }

    public void setTestPartNavigationUrl(final String testPartNavigationUrl) {
        this.testPartNavigationUrl = testPartNavigationUrl;
    }

    //----------------------------------------------------

    @Override
    public String toString() {
        return ObjectUtilities.beanToString(this);
    }
}
